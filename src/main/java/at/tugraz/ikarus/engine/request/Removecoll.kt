
package at.tugraz.ikarus.engine.request

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removecoll", propOrder = ["sid", "name", "id"])
@XmlRootElement
class Removecoll() {

    var sid: String? = null

    var name: String? = null

    var id: String? = null

    constructor(sid: String, id: String) : this() {
        this.sid = sid
        this.id = id
    }

}
