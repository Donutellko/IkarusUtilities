package at.tugraz.ikarus.engine

import javax.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getcoll", propOrder = ["sid", "name"])
@XmlRootElement
class Getcoll(var sid: String? = null, var name: String? = null)


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getcollResponse", propOrder = ["result"])
class GetcollResponse {

    @XmlElement(name = "return")
    var result: String? = null

}
