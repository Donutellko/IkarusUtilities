package at.tugraz.ikarus.utilities.service

import at.tugraz.ikarus.utilities.client.EngineClient
import org.springframework.stereotype.Service

@Service
class BasicService(private val engine: EngineClient) {

    fun store(s: String) = engine.store(s)

    fun get(id: String) = engine.get(id)

    fun delete(id: String) = engine.delete(id)

    fun hello(name: String) = engine.hello(name)

    fun makeCol(sid: String, name: String) = engine.makeCol(sid, name)

    fun getCol(sid: String) = engine.getCol(sid)

    fun deleleCol(sid: String) = engine.deleleCol(sid)

    fun insertCol(sid: String, id: String) = engine.insertCol(sid, id)

    fun removeCol(sid: String, id: String) = engine.removeCol(sid, id)

    fun reset(code: String) = engine.reset(code)


}