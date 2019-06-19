
package at.tugraz.ikarus.engine

import javax.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makecoll", propOrder = ["name", "id"])
@XmlRootElement
class Makecoll(var name: String? = null, var id: String? = null)


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makecollResponse", propOrder = ["result"])
class MakecollResponse {

    @XmlElement(name = "return")
    var result: String? = null

}
