package at.tugraz.ikarus.utilities.service

import com.fasterxml.jackson.databind.ObjectMapper
import domain.Node
import domain.SCollection
import domain.SObject
import org.springframework.stereotype.Service
import java.io.File
import java.io.FileWriter
import java.lang.StringBuilder
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Service
class ManagementService(private val basicService: BasicService) {

    fun stat(): Stat {
        val res = basicService.stat()!!
        val tmp = res.split("\n")

        val ids = tmp[0].trim().trim('[', ']').split(", ")
        val cols = mutableMapOf<String, String>()

        for (s in tmp[1].trim().trim('[', ']').split(", ")) {
            val i = s.indexOf("=")
            cols[s.substring(0, i)] = s.substring(i + 1)
        }

        return Stat(ids, cols)
    }

    fun fetchFullTree(): Map<String, Node> {

        val stat = stat()
        val nodes = mutableMapOf<String, Node>()
        val rootNodes = mutableMapOf<String, Node>() // nodes that are not in other nodes

        for (id in stat.ids) {
            nodes[id] = SObject(id = id, content = basicService.get(id))
            rootNodes[id] = SObject(id = id, content = basicService.get(id))
        }


        val sids = mutableListOf<String?>().apply { for (s in stat.cols.keys) add(s) }
        for (i in 0 until sids.size) {
            val sid = sids[i] ?: continue

            fun fetchSColl(sid: String, name: String): SCollection {
                if (nodes.containsKey(sid)) {
                    rootNodes.remove(sid)
                    return nodes[sid] as SCollection
                }

                // head id, then ids of child objects and sids of child SCollections
                val res = basicService.getCol(sid)!!.split(",")

                val collection = SCollection(sid = sid, name = name, head = nodes[res[0]] as SObject)
                rootNodes.remove(collection.head.id) // head is not root


                for (r in 1 until res.size) {
                    val id = res[r].substringBefore("(")
                    rootNodes.remove(id)
                    sids.replaceAll { t -> if (t == id) null else t }

                    collection.children.add(
                        if (id.startsWith("s-")) {
                            fetchSColl(id, stat.cols.getValue(id))
                        } else {
                            nodes.getValue(id)
                        }
                    )
                }
                return collection
            }

            nodes[sid] = fetchSColl(sid = sid, name = stat.cols.getValue(sid))
            rootNodes[sid] = nodes[sid]!!
        }

        return rootNodes
    }

    fun backup2(): String {
        val tree = fetchFullTree()
        val result = StringBuilder()

        fun stringify(n: Node) {
            if (n is SObject) {
                result.append(n.id).append("\t")
                    .append(
                        n.content
                            ?.replace("\n", "\\n")
                            ?.replace("\r", "\\r")
                    )
                    .append("\n")
            } else if (n is SCollection) {
                result.append(n.id).append("\t").append(n.name)
                for (c in n.children) {
                    result.append(n.id).append("\t").append(c)
                    stringify(c)
                }
            }
        }

        for (n in tree.values) stringify(n)

        return result.toString()
    }

    /**
     * Fetch all data from Engine, serialize it as JSON and write to file
     * in "backups" folder with current time as name, and .json as extension
     */
    fun backup(): Map<String, Node> {
        val tree = fetchFullTree()

        val json = ObjectMapper().writeValueAsString(tree)

        File("backups").mkdirs()
        val fw = FileWriter(
            "backups" + File.separator
                    + DateTimeFormatter.ofPattern("uuuu-MM-dd_kk-mm-ss").format(LocalDateTime.now()) + ".json"
        )

        fw.write(json)
        fw.close()

        return tree
    }

    data class Stat(val ids: Iterable<String>, val cols: Map<String, String>)

    fun get(id: String) = SObject(id, basicService.get(id))

    fun fetchTree(sid: String): SCollection {
        val ids = basicService.getCol(sid)!!.split(",")

        val name = basicService.stat()!!
            .substringAfter(sid).substringBefore(",").trim(']', ' ', '=')

        val result = SCollection(sid = sid, name = name, head = get(ids[0]))

        for (i in 1..ids.size) {
            val id = ids[i]
            if (id.startsWith("s-")) {
                result.children.add(fetchTree(id))
            } else {
                result.children.add(get(id))
            }
        }
        return result
    }
}