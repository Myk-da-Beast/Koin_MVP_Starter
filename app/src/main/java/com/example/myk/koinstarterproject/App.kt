package com.example.myk.koinstarterproject

import android.app.Application
import org.koin.android.ext.android.startKoin
import timber.log.Timber

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        // Start Timber
        Timber.plant(Timber.DebugTree())

        // Start Koin
        startKoin(
            this,
            listOf(appModule)
        )
    }
}