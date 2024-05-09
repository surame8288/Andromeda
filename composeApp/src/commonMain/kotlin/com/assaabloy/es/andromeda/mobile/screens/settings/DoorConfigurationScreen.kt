package com.assaabloy.es.andromeda.mobile.screens.settings

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.getScreenModel
import com.assaabloy.es.andromeda.mobile.logger.Logger

data object DoorConfigurationScreen : Screen{
    private val TAG = "DoorConfigurationScreen"
    @Composable
    override fun Content() {
        val doorConfigurationScreenModal : DoorConfigurationScreenModal = getScreenModel()
        Logger.d(TAG, ">>>wwqqee>>> $doorConfigurationScreenModal.objects")
    }
}