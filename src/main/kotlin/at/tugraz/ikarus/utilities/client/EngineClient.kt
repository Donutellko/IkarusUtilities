package at.tugraz.ikarus.utilities.client

import at.tugraz.ikarus.engine.*
import org.springframework.ws.client.core.support.WebServiceGatewaySupport
import javax.xml.bind.JAXBElement

// https://spring.io/guides/gs/consuming-web-service/
@Suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")
class EngineClient : WebServiceGatewaySupport() {

    /**
     * Marshal and send the given object, receive
     * */
    private fun send(request: Any): JAXBElement<*> =
        webServiceTemplate.marshalSendAndReceive(request) as JAXBElement<*>

    fun hello(name: String): HelloResponse {
        val response = send(Hello().apply { this.name = name })
        return response.value as HelloResponse
    }

    fun store(content: String): StoreResponse {
        val response = send(Store().apply { this.content = content })
        return response.value as StoreResponse
    }

    fun get(id: String): GetResponse {
        val response = send(Get().apply { this.id = id })
        return response.value as GetResponse
    }

    fun delete(id: String): DeleteResponse {
        val response = send(Delete().apply { this.id = id })
        return response.value as DeleteResponse
    }
}