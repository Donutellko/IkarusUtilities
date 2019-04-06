package at.tugraz.ikarus.utilities.service

import at.tugraz.ikarus.utilities.client.EngineClient
import org.springframework.stereotype.Service

@Service
class BasicService(private val engine: EngineClient) {

    fun store(s: String) = engine.store(s)

    fun get(id: String) = engine.get(id)

    fun delete(id: String) = engine.delete(id)

    fun hello(name: String) = engine.hello(name)

}