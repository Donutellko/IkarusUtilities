package at.tugraz.ikarus.engine.response

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletecollResponse", propOrder = ["result"])
class DeletecollResponse {

    @XmlElement(name = "return")
    var result: String? = null

}
