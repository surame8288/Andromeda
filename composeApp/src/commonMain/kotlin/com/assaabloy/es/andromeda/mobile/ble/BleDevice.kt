package com.assaabloy.es.andromeda.mobile.ble

/**
 * Defines the structure of a BLE device, including properties like name, address, and supported services.
 */
class BleDevice {
    enum class State {
        CONNECTING, SERVICES_DISCOVERED, CONNECTED, DISCONNECTING, DISCONNECTED
    }

    private lateinit var bleService: BleService
    var state: State = State.DISCONNECTED
}