package com.assaabloy.es.andromeda.mobile.data.modal.configuration

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LockReleaseTime(
    @SerialName("range") var values: Range = Range(),
    @SerialName("unit") var unit: String? = null,
    @SerialName("default") var default: Double = 0.0

) : ConfigurationModal<Double> {
    val TAG = "LockReleaseTime"
    private var time = default

    override fun getValue(): Double {
        return this.time
    }

    override fun getValues(): List<String> {
        return mutableListOf(values.min.toString(), values.max.toString())
    }

    override fun getDefaultValue(): Double = default

    @Composable
    override fun setValue(value: Double): MutableState<Double> {
        this.time = value
        var state = remember { mutableStateOf(this.time) }
        return state
    }

    override fun toString(): String {
        return this.time.toString()
    }
}