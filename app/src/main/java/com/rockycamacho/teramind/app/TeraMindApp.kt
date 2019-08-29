package com.rockycamacho.teramind.app

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen

class TeraMindApp: Application() {

    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
    }

}