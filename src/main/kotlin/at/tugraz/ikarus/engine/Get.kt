package at.tugraz.ikarus.engine

import javax.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get", propOrder = ["id"])
@XmlRootElement
class Get(var id: String? = null)


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getResponse", propOrder = ["result"])
class GetResponse {
    @XmlElement(name = "return")
    var result: String? = null
}