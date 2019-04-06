package at.tugraz.ikarus.utilities.client

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.oxm.jaxb.Jaxb2Marshaller

@Configuration
class EngineConfig(@Value("\${engine-url}") private val url: String) {

    @Bean
    fun marshaller() = Jaxb2Marshaller().apply { contextPath = "CoreWS.wsdl" }

    @Bean
    fun client(marsh: Jaxb2Marshaller) = EngineClient().apply {
        defaultUri = url
        marshaller = marsh
        unmarshaller = marsh
    }

}