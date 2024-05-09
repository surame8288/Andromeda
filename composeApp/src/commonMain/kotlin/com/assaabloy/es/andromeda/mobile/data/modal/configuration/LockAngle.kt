package com.assaabloy.es.andromeda.mobile.data.modal.configuration

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.assaabloy.es.andromeda.mobile.logger.Logger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LockAngle(
    @SerialName("range") var values: Range = Range(),
    @SerialName("unit") var unit: String? = null,
    @SerialName("default") var default: Double = 0.0,
    @SerialName("common") var common: Boolean? = null
) : ConfigurationModal<Double> {
    val TAG = "LockAngle"
    private var angle = default

    override fun getValue(): Double? {
        return this.angle
    }

    override fun getValues(): List<String> {
        return mutableListOf(values.min.toString(), values.max.toString())
    }

    override fun getDefaultValue(): Double = default

    @Composable
    override fun setValue(value: Double): MutableState<Double> {
        Logger.d("ConfigurationModal", "LockAngle#setValue")
        this.angle = value
        var state = remember { mutableStateOf(this.angle) }
        return state
    }

    override fun toString(): String {
        return this.angle.toString()
    }
}