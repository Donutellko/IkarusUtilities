package at.tugraz.ikarus.engine.request

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delete", propOrder = ["id"])
@XmlRootElement
class Delete() {

    var id: String? = null

    constructor(id: String) : this() {
        this.id = id
    }

}
