package com.example.dwitchapp

import android.app.Application
import timber.log.Timber

class MonApplication : Application() {
    override fun onCreate(){
        super.onCreate()

        if (BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }
    }
}