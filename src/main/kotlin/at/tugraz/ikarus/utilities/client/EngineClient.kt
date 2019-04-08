package at.tugraz.ikarus.utilities.client

import at.tugraz.ikarus.engine.request.*
import at.tugraz.ikarus.engine.response.*
import org.springframework.ws.client.core.support.WebServiceGatewaySupport
import javax.xml.bind.JAXBElement

// https://spring.io/guides/gs/consuming-web-service/
@Suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")
class EngineClient : WebServiceGatewaySupport() {

    /**
     * Marshal and send the given object, receive and return JAXBElement
     * */
    private fun send(request: Any): JAXBElement<*> =
        webServiceTemplate.marshalSendAndReceive(request) as JAXBElement<*>

    fun hello(name: String): HelloResponse {
        val response = send(Hello(name))
        return response.value as HelloResponse
    }

    fun store(content: String): StoreResponse {
        val response = send(Store(content))
        return response.value as StoreResponse
    }

    fun get(id: String): GetResponse {
        val response = send(Get(id))
        return response.value as GetResponse
    }

    fun delete(id: String): DeleteResponse {
        val response = send(Delete(id))
        return response.value as DeleteResponse
    }

    fun makeCol(sid: String, name: String): MakecollResponse {
        val response = send(Makecoll(sid, name))
        return response.value as MakecollResponse
    }

    fun getCol(sid: String): MakecollResponse {
        val response = send(Getcoll(sid))
        return response.value as MakecollResponse
    }

    fun deleleCol(sid: String): MakecollResponse {
        val response = send(Deletecoll(sid))
        return response.value as MakecollResponse
    }

    fun insertCol(sid: String, id: String): MakecollResponse {
        val response = send(Insertcoll(sid, id))
        return response.value as MakecollResponse
    }

    fun removeCol(sid: String, id: String): MakecollResponse {
        val response = send(Removecoll(sid, id))
        return response.value as MakecollResponse
    }

    fun reset(code: String): ResetResponse {
        val response = send(Reset(code))
        return response.value as ResetResponse
    }

}