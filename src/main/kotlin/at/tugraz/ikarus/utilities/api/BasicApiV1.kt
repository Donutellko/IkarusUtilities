@file:Suppress("unused")

package at.tugraz.ikarus.utilities.api

import at.tugraz.ikarus.utilities.service.BasicService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["/v1"])
class BasicApiV1 (private val basic: BasicService) {

    @RequestMapping("/")
    fun index() = basic.hello("my friend")

    @RequestMapping("/hello")
    fun hello(@RequestParam("name") name: String) = basic.hello(name)

    @RequestMapping("/store")
    fun store(@RequestParam("content") s: String) = basic.store(s)

    @RequestMapping("/get")
    fun get(@RequestParam("id") id: String) = basic.get(id)

    @RequestMapping("/delete")
    fun delete(@RequestParam("id") id: String) = basic.delete(id)


    @RequestMapping("/makecol")
    fun makeCol(
        @RequestParam("sid") sid: String,
        @RequestParam("name") name: String
    ) = basic.makeCol(sid, name)

    @RequestMapping("/getcol")
    fun getCol(
        @RequestParam("sid") sid: String,
        @RequestParam("name") name: String
    ) = basic.getCol(sid, name)

    @RequestMapping("/deletecol")
    fun deleteCol(
        @RequestParam("sid") sid: String?,
        @RequestParam("sid") name: String?
    ) = basic.deleleCol(sid, name)

    @RequestMapping("/insertcol")
    fun insertCol(
        @RequestParam("sid") sid: String,
        @RequestParam("id") id: String
    ) = basic.insertCol(sid, id)

    @RequestMapping("/removecol")
    fun removeCol(
        @RequestParam("sid") sid: String,
        @RequestParam("id") id: String
    ) = basic.removeCol(sid, id)

    @RequestMapping("/reset")
    fun reset(@RequestParam("code") code: String) = basic.reset(code)



}