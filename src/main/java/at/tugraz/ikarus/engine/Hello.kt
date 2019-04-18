package at.tugraz.ikarus.engine

import javax.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hello", propOrder = ["name"])
@XmlRootElement
class Hello(var name: String? = null)


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "helloResponse", propOrder = ["result"])
class HelloResponse {

    @XmlElement(name = "return")
    var result: String? = null

}
