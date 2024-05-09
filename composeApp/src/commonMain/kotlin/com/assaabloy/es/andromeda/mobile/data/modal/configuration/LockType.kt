package com.assaabloy.es.andromeda.mobile.data.modal.configuration

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LockType(
    @SerialName("values") var values: ArrayList<String> = arrayListOf(),
    @SerialName("default") var default: String = ""

) : ConfigurationModal<String> {
    val TAG = "LockType"
    private var type = default

    override fun getValue(): String {
        return this.type
    }

    override fun getValues(): List<String> {
        return values
    }

    override fun getDefaultValue(): String = default.toString()

    @Composable
    override fun setValue(value: String): MutableState<String> {
        this.type = value
        var state = remember { mutableStateOf(this.type) }
        return state
    }

    override fun toString(): String {
        return this.type
    }
}