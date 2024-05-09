package com.assaabloy.es.andromeda.mobile.data.modal.configuration

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Range(

    @SerialName("min") var min: Double = 0.0,
    @SerialName("max") var max: Double = 0.0

)