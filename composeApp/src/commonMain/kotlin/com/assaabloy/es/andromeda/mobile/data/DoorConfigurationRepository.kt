package com.assaabloy.es.andromeda.mobile.data

import com.assaabloy.es.andromeda.mobile.data.modal.configuration.DoorConfigurationModal
import com.assaabloy.es.andromeda.mobile.logger.Logger
import com.assaabloy.es.andromeda.mobile.preferences.AppPreferences
import com.test.lockconfiguration.api.AccessControlApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class DoorConfigurationRepository(
    private val api : AccessControlApi,
    private val storage: AppPreferences,
) {
    private val TAG = "DoorConfigurationRepository"
    private val scope = CoroutineScope(SupervisorJob())

    fun initialize() {
        Logger.d (TAG, "DoorConfigurationRepository#initialize Step-1" )
        scope.launch {
            Logger.d (TAG, "DoorConfigurationRepository#initialize Step-2" )
            refresh()
            Logger.d (TAG, "xMuseumRepository#initialize Step-3" )
        }
        Logger.d (TAG, "DoorConfigurationRepository#initialize Step-5" )
    }

    suspend fun refresh() {
        Logger.d (TAG, "DoorConfigurationRepository#refresh Step-1" )
        val res = api.getDoorConfigData()
        Logger.d (TAG, "DoorConfigurationRepository#refresh Step-1.1" )
        storage.setDoorConfiguration(res)
        Logger.d (TAG, "DoorConfigurationRepository#refresh Step-2" )
    }

    fun getDoorConfiguration(): Flow<DoorConfigurationModal> = storage.getDoorConfiguration()
}