package at.tugraz.ikarus.engine

import javax.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stat")
@XmlRootElement
class Stat


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statResponse", propOrder = ["result"])
class StatResponse {

    @XmlElement(name = "return")
    var result: String? = null

}
