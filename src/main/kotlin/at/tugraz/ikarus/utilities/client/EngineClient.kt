package at.tugraz.ikarus.utilities.client

import at.tugraz.ikarus.engine.*
import org.springframework.ws.client.core.support.WebServiceGatewaySupport
import java.lang.IllegalArgumentException
import javax.xml.bind.JAXBElement

// https://spring.io/guides/gs/consuming-web-service/
//@Suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")
class EngineClient : WebServiceGatewaySupport() {

    /**
     * Marshal and send the given object, receive and return JAXBElement
     * */
    private fun send(request: Any): JAXBElement<*> =
        webServiceTemplate.marshalSendAndReceive(request) as JAXBElement<*>

    fun hello(name: String): HelloResponse {
        val response = send(Hello(name = name))
        return response.value as HelloResponse
    }

    fun store(content: String): StoreResponse {
        val response = send(Store(content = content))
        return response.value as StoreResponse
    }

    fun get(id: String): GetResponse {
        val response = send(Get(id = id))
        return response.value as GetResponse
    }

    fun change(id: String, content: String): ChangeResponse {
        val response = send(Change(id = id, content = content))
        return response.value as ChangeResponse
    }

    fun delete(id: String): DeleteResponse {
        val response = send(Delete(id = id))
        return response.value as DeleteResponse
    }

    fun makeCol(sid: String, name: String): MakecollResponse {
        val response = send(Makecoll(id = sid, name = name))
        return response.value as MakecollResponse
    }

    fun getCol(sid: String?, name: String?): GetcollResponse {
        if (sid == null && name == null)
            throw IllegalArgumentException("Both sid and name should not be null!")
        val response = send(Getcoll(sid = sid, name = name))
        return response.value as GetcollResponse
    }

    fun deleteCol(sid: String?, name: String?): DeletecollResponse {
        if (sid == null && name == null)
            throw IllegalArgumentException("Both sid and name should not be null!")
        val response = send(Deletecoll(sid = sid, name = name))
        return response.value as DeletecollResponse
    }

    fun insertCol(sid: String, id: String): InsertcollResponse {
        val response = send(Insertcoll(sid = sid, id = id))
        return response.value as InsertcollResponse
    }

    fun removeCol(sid: String, id: String): RemovecollResponse {
        val response = send(Removecoll(sid = sid, id = id))
        return response.value as RemovecollResponse
    }

    fun reset(code: String): ResetResponse {
        val response = send(Reset(doom = code))
        return response.value as ResetResponse
    }

    fun searchColl(id: String): SearchcollResponse {
        val response = send(Searchcoll(id = id))
        return response.value as SearchcollResponse
    }

    fun searchObj(text: String): SearchobjResponse {
        val response = send(Searchobj(text = text))
        return response.value as SearchobjResponse
    }

    fun stat(): StatResponse {
        val response = send(Stat())
        return response.value as StatResponse
    }

}