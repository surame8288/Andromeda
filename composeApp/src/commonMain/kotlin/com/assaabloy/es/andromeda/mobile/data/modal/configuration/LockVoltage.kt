package com.assaabloy.es.andromeda.mobile.data.modal.configuration

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LockVoltage(
    @SerialName("values") private var values: ArrayList<String> = arrayListOf(),
    @SerialName("default") private var default: String = ""

) : ConfigurationModal<String> {
    val TAG = "LockVoltage"
    private var voltage = default

    override fun getValue(): String {
        return this.voltage
    }

    override fun getValues(): List<String> {
        return values
    }

    override fun getDefaultValue(): String = default.toString()

    @Composable
    override fun setValue(value: String): MutableState<String> {
        this.voltage = value
        var state = remember { mutableStateOf(this.voltage) }
        return state
    }

    override fun toString(): String {
        return this.voltage
    }
}