package at.tugraz.ikarus.utilities

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ConfigurableApplicationContext

@SpringBootApplication
class UtilitiesApplication

private var context: ConfigurableApplicationContext? = null

fun main(args: Array<String>) {

    context = runApplication<UtilitiesApplication>(*args) {
        setBannerMode(Banner.Mode.CONSOLE)
    }
}