package com.yoesuv.applanguage.utils

import android.content.Context

class PreferencesHelper(context: Context) {

    private val prefHelper = context.getSharedPreferences("pref_app", Context.MODE_PRIVATE)

    fun setString(key: String, value: String) {
        prefHelper.edit().putString(key, value).apply()
    }

    fun getString(key: String): String {
        return prefHelper.getString(key, "") ?: ""
    }
}