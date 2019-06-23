package domain

public open class Node(val id: String)

public class SCollection(
    sid: String,
    val name: String,
    val head: SObject,
    val children: MutableList<Node> = mutableListOf()) : Node(sid)

public class SObject(id: String, var content: String? = null) : Node(id)
