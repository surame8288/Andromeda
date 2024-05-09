package com.assaabloy.es.andromeda.mobile.logger

import platform.Foundation.NSLog

actual object Logger {
    actual fun d(tag: String, message: String) {
        NSLog("Debug : $message")
    }

    actual fun i(tag: String, message: String) {
        NSLog("Info : $message")
    }

    actual fun w(tag: String, message: String) {
        NSLog("Warning : $message")
    }

    actual fun e(tag: String, message: String) {
        NSLog("Error : $message")
    }
}