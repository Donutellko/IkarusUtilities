package at.tugraz.ikarus.engine

import javax.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "store", propOrder = ["content"])
@XmlRootElement
class Store(var content: String? = null)


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeResponse", propOrder = ["result"])
class StoreResponse {

    @XmlElement(name = "return")
    var result: String? = null

}
