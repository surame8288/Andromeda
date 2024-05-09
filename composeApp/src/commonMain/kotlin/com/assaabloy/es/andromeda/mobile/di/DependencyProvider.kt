package com.assaabloy.es.andromeda.mobile.di

import com.assaabloy.es.andromeda.mobile.config.ApiConfig.BASEURL
import com.assaabloy.es.andromeda.mobile.data.DoorConfigurationRepository
import com.assaabloy.es.andromeda.mobile.preferences.AppPreferences
import com.assaabloy.es.andromeda.mobile.screens.settings.DoorConfigurationScreenModal
import com.test.lockconfiguration.api.AccessControlApi
import com.test.lockconfiguration.api.AccessControlApiImpl
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.ContentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.dsl.module
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.headers
import io.ktor.http.contentType
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.factoryOf

private const val HTTP_CLIENT_DEFAULT_TIMEOUT = 15_000L

val dataModule = module {
    single {
        val json = Json { ignoreUnknownKeys = true }
        HttpClient {
            install(ContentNegotiation) {
                json(json, contentType = ContentType.Application.Json)
            }
            install(HttpTimeout) {
                requestTimeoutMillis = HTTP_CLIENT_DEFAULT_TIMEOUT
                connectTimeoutMillis = HTTP_CLIENT_DEFAULT_TIMEOUT
                socketTimeoutMillis = HTTP_CLIENT_DEFAULT_TIMEOUT
            }
            defaultRequest {
                url(BASEURL)
                headers {
                    contentType(ContentType.Application.Json)
                }
            }
            expectSuccess = false
        }
    }

    single<AccessControlApi> { AccessControlApiImpl(get()) }
    single { AppPreferences() }
    single {
        DoorConfigurationRepository(get(), get()).apply {
            initialize()
        }
    }

}

val screenModelsModule = module {
    factoryOf(::DoorConfigurationScreenModal)
}

fun initKoin() {
    startKoin {
        modules(
            dataModule, screenModelsModule
        )
    }
}
