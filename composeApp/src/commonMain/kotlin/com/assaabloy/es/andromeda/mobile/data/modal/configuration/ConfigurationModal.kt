package com.assaabloy.es.andromeda.mobile.data.modal.configuration

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import kotlinx.serialization.Serializable

interface ConfigurationModal<T> {
    fun getValue(): T?
    fun getValues(): List<String>
    fun getDefaultValue(): T
    @Composable
    fun setValue(value: T): MutableState<T>

}