package at.tugraz.ikarus.engine.request

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hello", propOrder = ["name"])
@XmlRootElement
class Hello() {

    var name: String? = null

    constructor(name: String) : this() {
        this.name = name
    }

}
