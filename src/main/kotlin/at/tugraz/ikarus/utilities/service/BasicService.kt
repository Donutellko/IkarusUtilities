package at.tugraz.ikarus.utilities.service

import at.tugraz.ikarus.utilities.client.EngineClient
import org.springframework.stereotype.Service

@Service
class BasicService(private val engine: EngineClient) {

    fun store(s: String) = engine.store(s).result

    fun get(id: String) = engine.get(id).result

    fun delete(id: String) = engine.delete(id).result

    fun hello(name: String) = engine.hello(name).result

    fun makeCol(sid: String, name: String) = engine.makeCol(sid, name).result

    fun getCol(sid: String?, name: String?) = engine.getCol(sid, name).result

    fun deleleCol(sid: String?, name: String?) = engine.deleleCol(sid, name).result

    fun insertCol(sid: String, id: String) = engine.insertCol(sid, id).result

    fun removeCol(sid: String, id: String) = engine.removeCol(sid, id).result

    fun reset(code: String) = engine.reset(code).result


}