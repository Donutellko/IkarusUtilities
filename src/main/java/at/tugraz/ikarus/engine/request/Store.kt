package at.tugraz.ikarus.engine.request

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "store", propOrder = ["content"])
@XmlRootElement
class Store() {

    var content: String? = null

    constructor(content: String) : this() {
        this.content = content
    }

}
