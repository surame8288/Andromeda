package com.assaabloy.es.andromeda.mobile.data.modal.configuration

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.assaabloy.es.andromeda.mobile.logger.Logger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LockKick(
    @SerialName("values") var values: ArrayList<String> = arrayListOf(),
    @SerialName("default") var default: String = ""
) : ConfigurationModal<String> {
    val TAG = "LockKick"
    private var kick = default

    override fun getValue(): String? {
        return this.kick
    }

    override fun getValues(): List<String> {
        return values
    }

    override fun getDefaultValue(): String = default

    @Composable
    override fun setValue(value: String): MutableState<String> {
        Logger.d("ConfigurationModal", "LockKick#setValue")
        this.kick = value
        var state = remember { mutableStateOf(this.kick) }
        return state
    }

    override fun toString(): String {
        return this.kick
    }
}