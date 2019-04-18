
package at.tugraz.ikarus.engine.request

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makecoll", propOrder = ["name", "id"])
@XmlRootElement
class Makecoll() {

    var name: String? = null

    var id: String? = null

    constructor(id: String, name: String) : this() {
        this.name = name
        this.id = id
    }

}
