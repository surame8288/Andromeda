package com.assaabloy.es.andromeda.mobile.screens.settings

import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import com.assaabloy.es.andromeda.mobile.data.DoorConfigurationRepository
import com.assaabloy.es.andromeda.mobile.data.modal.configuration.DoorConfigurationModal
import com.assaabloy.es.andromeda.mobile.preferences.AppPreferences
import com.test.lockconfiguration.api.AccessControlApi
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class DoorConfigurationScreenModal(doorConfigurationRepository: DoorConfigurationRepository) : ScreenModel {
    val objects: StateFlow<DoorConfigurationModal> =
        doorConfigurationRepository.getDoorConfiguration()
            .stateIn(screenModelScope, SharingStarted.WhileSubscribed(5000), DoorConfigurationModal())

}