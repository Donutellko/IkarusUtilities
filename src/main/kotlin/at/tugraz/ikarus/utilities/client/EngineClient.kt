package at.tugraz.ikarus.utilities.client

import org.springframework.ws.client.core.support.WebServiceGatewaySupport

import CoreWS.wsdl.GET
import CoreWS.wsdl.Hello
import CoreWS.wsdl.STORE

// https://spring.io/guides/gs/consuming-web-service/
class EngineClient : WebServiceGatewaySupport() {

    fun hello(name: String) =
        webServiceTemplate.marshalSendAndReceive(Hello().apply { this.name = name })

    fun store(content: String) =
        webServiceTemplate.marshalSendAndReceive(STORE().apply { this.content = content })

    fun get(id: String) =
        webServiceTemplate.marshalSendAndReceive(GET().apply { this.id = id })

    fun delete(id: String): String? = null
}