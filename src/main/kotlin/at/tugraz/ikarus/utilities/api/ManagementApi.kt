package at.tugraz.ikarus.utilities.api

import at.tugraz.ikarus.utilities.service.ManagementService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/management"])
class ManagementApi(private val managementService: ManagementService) {

    /**
     * Create a backup of current state of database
     */
    @RequestMapping("/backup")
    fun backup() = managementService.backup()

    /**
     * Get a json of collection with provided sid, or full tree otherwise
     */
    @RequestMapping("/fetch")
    fun fetch(@RequestParam(name = "sid", required = false) sid: String?): Any =
        if (sid == null)
            managementService.fetchFullTree()
        else
            managementService.fetchTree(sid)

}