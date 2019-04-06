@file:Suppress("unused")

package at.tugraz.ikarus.utilities.api

import at.tugraz.ikarus.utilities.service.BasicService
import org.springframework.web.bind.annotation.*

@RestController
class BasicApi (private val basic: BasicService) {

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

}