package ui.screen

import Platform
import getPlatform

class Greeting(private val platform: Platform) {

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}