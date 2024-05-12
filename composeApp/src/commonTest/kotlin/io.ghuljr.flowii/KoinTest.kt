package io.ghuljr.flowii

import di.appModules
import org.koin.test.check.checkKoinModules
import kotlin.test.Test

class KoinTest {

    @Test
    fun checkModules() {
        checkKoinModules(appModules())
    }
}