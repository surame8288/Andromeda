package com.assaabloy.es.andromeda.mobile.logger

expect object Logger {
    fun d(tag: String = "Andromeda", message: String)
    fun i(tag: String = "Andromeda", message: String)
    fun w(tag: String = "Andromeda", message: String)
    fun e(tag: String = "Andromeda", message: String)
}