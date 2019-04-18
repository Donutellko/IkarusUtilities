package at.tugraz.ikarus.engine.request

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getcoll", propOrder = ["sid", "name"])
@XmlRootElement
class Getcoll() {

    var sid: String? = null

    var name: String? = null

    constructor(sid: String) : this() {
        this.sid = sid
    }

}
