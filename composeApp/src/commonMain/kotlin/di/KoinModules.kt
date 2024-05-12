package di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import getPlatform
import ui.screen.Greeting

val platformModule = module {
    singleOf(::getPlatform)
}

val commonModule = module {
    singleOf(::Greeting)
}

fun appModules() = listOf(platformModule, commonModule)