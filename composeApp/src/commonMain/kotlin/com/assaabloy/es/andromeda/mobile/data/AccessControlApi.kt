package com.test.lockconfiguration.api

import com.assaabloy.es.andromeda.mobile.config.ApiConfig
import com.assaabloy.es.andromeda.mobile.data.modal.configuration.DoorConfigurationModal
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

interface AccessControlApi {
    suspend fun getDoorConfigData(): DoorConfigurationModal
}

class AccessControlApiImpl(private val client : HttpClient) : AccessControlApi {
    override suspend fun getDoorConfigData(): DoorConfigurationModal = client.get(ApiConfig.DOOR_CONFIG_URL){}.body<DoorConfigurationModal>()

}
