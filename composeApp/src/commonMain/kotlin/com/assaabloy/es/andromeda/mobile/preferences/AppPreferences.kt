package com.assaabloy.es.andromeda.mobile.preferences

import com.assaabloy.es.andromeda.mobile.data.modal.configuration.DoorConfigurationModal
import kotlinx.coroutines.flow.MutableStateFlow

class AppPreferences {
    private val doorConfiguration = MutableStateFlow(DoorConfigurationModal())

    fun getDoorConfiguration() = doorConfiguration
    fun setDoorConfiguration(doorConfiguration: DoorConfigurationModal) {
        this.doorConfiguration.value = doorConfiguration
    }



}