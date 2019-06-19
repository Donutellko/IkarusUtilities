package at.tugraz.ikarus.engine

import javax.xml.bind.annotation.*


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reset", propOrder = ["doom"])
@XmlRootElement
class Reset(var doom: String? = null)

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resetResponse", propOrder = ["result"])
class ResetResponse {

    @XmlElement(name = "return")
    var result: String? = null

}
