package at.tugraz.ikarus.engine

import javax.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delete", propOrder = ["id"])
@XmlRootElement
class Delete(var id: String? = null)


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteResponse", propOrder = ["result"])
class DeleteResponse {

    @XmlElement(name = "return")
    var result: String? = null

}
