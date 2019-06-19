package at.tugraz.ikarus.engine

import javax.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertcoll", propOrder = ["sid", "name", "id"])
@XmlRootElement
class Insertcoll(var sid: String? = null, var id: String? = null, var name: String? = null)


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertcollResponse", propOrder = ["result"])
class InsertcollResponse {

    @XmlElement(name = "return")
    var result: String? = null

}
