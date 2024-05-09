package com.assaabloy.es.andromeda.mobile

import android.app.Application
import com.assaabloy.es.andromeda.mobile.di.initKoin

class AndromedaApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}