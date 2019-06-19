@file:Suppress("unused")

package at.tugraz.ikarus.utilities.api

import at.tugraz.ikarus.utilities.service.BasicService
import at.tugraz.ikarus.utilities.service.JsonUtils
import org.springframework.web.bind.annotation.*
import java.lang.IllegalArgumentException

@RestController
@RequestMapping(value = ["/", "/v2"])
class BasicApi(private val basic: BasicService) {

    @RequestMapping("/")
    fun index() = basic.hello("my friend")

    @RequestMapping("/hello")
    fun hello(@RequestParam("name") name: String) = basic.hello(name)


    @PostMapping("/data")
    fun store(
        @RequestParam(name = "id", required = false) id: String? = null,
        @RequestParam(name = "content", required = true) s: String,
        @RequestParam(name = "validate", required = false) validate: Boolean = false
    ) = if (validate && !JsonUtils.isValid(s)) {
        null
    } else if (id != null) {
        basic.change(id, s)
    } else {
        basic.store(s)
    }

    @GetMapping("/data")
    fun get(@RequestParam("id") id: String) = basic.get(id)

    @PostMapping("/data/search")
    fun search(@RequestParam("text") text: String) = basic.searchObj(text)

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
    ) = basic.deleleCol(sid = sid, name = name)

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