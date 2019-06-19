
package at.tugraz.ikarus.engine

import javax.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removecoll", propOrder = ["sid", "name", "id"])
@XmlRootElement
class Removecoll(var sid: String? = null, var id: String? = null, var name: String? = null)


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removecollResponse", propOrder = ["result"])
class RemovecollResponse {

    @XmlElement(name = "return")
    var result: String? = null

}
