package com.assaabloy.es.andromeda.mobile.data.modal.configuration

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DoorConfigurationModal(

    @SerialName("lockVoltage") var lockVoltage: LockVoltage = LockVoltage(),
    @SerialName("lockType") var lockType: LockType = LockType(),
    @SerialName("lockKick") var lockKick: LockKick = LockKick(),
    @SerialName("lockRelease") var lockRelease: LockRelease = LockRelease(),
    @SerialName("lockReleaseTime") var lockReleaseTime: LockReleaseTime = LockReleaseTime(),
    @SerialName("lockAngle") var lockAngle: LockAngle = LockAngle()


)
