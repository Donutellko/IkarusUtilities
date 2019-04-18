package at.tugraz.ikarus.engine.response

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makecollResponse", propOrder = ["result"])
class MakecollResponse {

    @XmlElement(name = "return")
    var result: String? = null

}
