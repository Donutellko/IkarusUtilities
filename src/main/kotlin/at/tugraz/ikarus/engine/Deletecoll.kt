
package at.tugraz.ikarus.engine

import javax.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletecoll", propOrder = ["sid", "name"])
@XmlRootElement
class Deletecoll(var sid: String? = null, var name: String? = null)


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletecollResponse", propOrder = ["result"])
class DeletecollResponse {

    @XmlElement(name = "return")
    var result: String? = null

}