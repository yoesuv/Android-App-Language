package com.yoesuv.applanguage

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat
import com.yoesuv.applanguage.utils.PreferencesHelper

class MyApp: Application() {

    companion object {
        var prefHelper: PreferencesHelper? = null
    }

    override fun onCreate() {
        super.onCreate()
        prefHelper = PreferencesHelper(this)
        // Apply saved language (BCP-47 tag) using AppCompat per-app language API
        val savedTag = prefHelper?.getString("language") ?: "en"
        val locales = LocaleListCompat.forLanguageTags(savedTag)
        AppCompatDelegate.setApplicationLocales(locales)
    }

}