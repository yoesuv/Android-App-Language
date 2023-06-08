package com.yoesuv.applanguage

import android.app.Application
import com.yoesuv.applanguage.utils.PreferencesHelper

class MyApp: Application() {

    companion object {
        var prefHelper: PreferencesHelper? = null
    }

    override fun onCreate() {
        super.onCreate()
        prefHelper = PreferencesHelper(this)
    }

}