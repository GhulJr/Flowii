package di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import getPlatform
import org.koin.core.context.startKoin

val platformModule = module {
    singleOf(::getPlatform)
}

val commonModule = module {

}

fun appModule() = listOf(platformModule, commonModule)

fun initKoin() {
    startKoin {
        modules(appModule())
    }
}
