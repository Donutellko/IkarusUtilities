package at.tugraz.ikarus.engine.request

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.XmlType


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reset", propOrder = ["doom"])
@XmlRootElement
class Reset() {

    var doom: String? = null

    constructor(doom: String) : this() {
        this.doom = doom
    }

}
