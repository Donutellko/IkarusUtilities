@file:Suppress("unused")

package at.tugraz.ikarus.utilities.api

import at.tugraz.ikarus.utilities.service.BasicService
import at.tugraz.ikarus.utilities.Utils.JsonUtils
import org.springframework.web.bind.annotation.*
import java.lang.IllegalArgumentException

@RestController
@RequestMapping(value = ["/", "/basic"])
class BasicApi(private val basic: BasicService) {

    @RequestMapping("/")
    fun index() = basic.hello("my friend")

    @RequestMapping("/hello")
    fun hello(@RequestParam("name") name: String) = basic.hello(name)

    /**
     * Add or replace [content] in a storage as an object.
     * If [id] is provided, it will replace an object with that id. Otherwise,
     * a new object will be added.
     * If [validate] is provided and is true, the [content] will be checked to
     * be a valid JSON string.
     *
     *
     * @param id        id of an existing object in database to be replaced.
     * @param content   text string to be stored.
     * @param validate  if need to check, if it is a valid JSON.
     *
     * @return an id of stored data, or null, if json is invalid or an error occurred.
     */
    @PostMapping("/data")
    fun store(
        @RequestParam(name = "id", required = false) id: String? = null,
        @RequestParam(name = "content", required = true) content: String,
        @RequestParam(name = "validate", required = false) validate: Boolean = false
    ) = if (validate && !JsonUtils.isValid(content)) {
        null
    } else if (id != null) {
        basic.change(id, content)
    } else {
        basic.store(content)
    }

    /**
     * Get a data with provided id.
     *
     * @param id of a data to get.
     *
     * @return string stored with provided id, or null, if nothing is
     * stored or an error occurred.
     */
    @GetMapping("/data")
    fun get(@RequestParam("id") id: String) = basic.get(id)

    /**
     * Get ids of objects, which contain provided [text].
     *
     * @param text to be searched for.
     *
     * @return a list of id's of objects which contain provided text.
     */
    @PostMapping("/data/search")
    fun search(@RequestParam("text") text: String) = basic.searchObj(text)

    /**
     * Remove data with provided id from storage.
     *
     * @param id of an object to delete
     *
     *
     */
    @DeleteMapping("/data")
    fun delete(@RequestParam("id") id: String) = basic.delete(id)


    @PostMapping("/coll")
    fun makeColl(
        @RequestParam("sid") sid: String,
        @RequestParam("name") name: String
    ) = basic.makeCol(sid, name)

    @GetMapping("/coll")
    fun getColl(
        @RequestParam(value = "sid") sid: String,
        @RequestParam(value = "name", required = false) name: String?
    ) = try {
        basic.getCol(sid = sid, name = name)
    } catch (e: IllegalArgumentException) {
        e.printStackTrace()
        e.message
    }

    @GetMapping("/coll/search")
    fun searchColl(@RequestParam("id") id: String) = basic.searchColl(id)

    @DeleteMapping("/coll")
    fun deleteColl(
        @RequestParam(value = "sid") sid: String,
        @RequestParam(value = "name", required = false) name: String?
    ) = basic.deleteCol(sid = sid, name = name)

    @PostMapping("/incoll")
    fun insertIntoColl(
        @RequestParam("sid") sid: String,
        @RequestParam("id") id: String
    ) = basic.insertCol(sid, id)

    @DeleteMapping("/incoll")
    fun removeFromColl(
        @RequestParam("sid") sid: String,
        @RequestParam("id") id: String
    ) = basic.removeCol(sid, id)

    @RequestMapping("/stat")
    fun stat() = basic.stat()

    @RequestMapping("/reset")
    fun reset(@RequestParam("code") code: String) = basic.reset(code)


}