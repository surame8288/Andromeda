package com.assaabloy.es.andromeda.mobile.data.modal.configuration

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LockRelease(
    @SerialName("values") var values: ArrayList<String> = arrayListOf(),
    @SerialName("default") var default: String = "",
    @SerialName("common") var common: Boolean? = null

) : ConfigurationModal<String> {
    val TAG = "LockRelease"
    private var release = default

    override fun getValue(): String {
        return this.release
    }

    override fun getValues(): List<String> {
        return values
    }

    override fun getDefaultValue(): String = default

    @Composable
    override fun setValue(value: String): MutableState<String> {
        this.release = value
        var state = remember { mutableStateOf(this.release) }
        return state
    }

    override fun toString(): String {
        return this.release
    }
}