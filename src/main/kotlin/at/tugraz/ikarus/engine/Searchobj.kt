package at.tugraz.ikarus.engine

import javax.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchobj", propOrder = ["text"])
@XmlRootElement
class Searchobj(var text: String? = null)


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchobjResponse", propOrder = ["result"])
class SearchobjResponse {

    @XmlElement(name = "return")
    var result: String? = null

}
