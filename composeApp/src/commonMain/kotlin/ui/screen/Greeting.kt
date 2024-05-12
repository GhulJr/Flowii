package ui.screen

import getPlatform

class Greeting {
    // TODO: inject it for tests??
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}