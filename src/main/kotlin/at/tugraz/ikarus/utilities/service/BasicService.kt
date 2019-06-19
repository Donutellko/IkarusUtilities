package at.tugraz.ikarus.utilities.service

import at.tugraz.ikarus.utilities.client.EngineClient
import org.springframework.stereotype.Service

@Service
class BasicService(private val engine: EngineClient) {

    fun hello(name: String) = engine.hello(name = name).result

    fun store(s: String) = engine.store(content = s).result

    fun get(id: String) = engine.get(id = id).result

    fun delete(id: String) = engine.delete(id = id).result

    fun makeCol(sid: String, name: String) = engine.makeCol(sid = sid, name = name).result

    fun getCol(sid: String?, name: String?) = engine.getCol(sid = sid, name = name).result

    fun deleleCol(sid: String?, name: String?) = engine.deleteCol(sid = sid, name = name).result

    fun insertCol(sid: String, id: String) = engine.insertCol(sid = sid, id = id).result

    fun removeCol(sid: String, id: String) = engine.removeCol(sid = sid, id = id).result

    fun reset(code: String) = engine.reset(code = code).result

    fun searchObj(text: String) = engine.searchObj(text = text).result

    fun searchColl(id: String) = engine.searchColl(id = id).result

    fun stat() = engine.stat().result

    fun change(id: String, content: String) = engine.change(id = id, content = content).result

}