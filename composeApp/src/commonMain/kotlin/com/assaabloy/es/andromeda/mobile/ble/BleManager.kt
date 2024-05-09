package com.assaabloy.es.andromeda.mobile.ble

/**
 * Defines the interface or class for managing BLE connections, including methods for device discovery, connecting,
 * disconnecting, reading, and writing characteristics.
 */
object BleManager {

    fun scanForDevices(callback: (List<BleDevice>) -> Unit) {

    }

    fun stopScan() {

    }

    fun connectToDevice(device: BleDevice, callback: (Boolean) -> Unit) {

    }

    fun disconnectDevice(device: BleDevice) {

    }

    fun readCharacteristic(
        device: BleDevice,
        characteristicId: String,
        callback: (ByteArray?) -> Unit
    ) {

    }

    fun writeCharacteristic(
        device: BleDevice,
        characteristicId: String,
        data: ByteArray,
        callback: (Boolean) -> Unit
    ) {

    }

}