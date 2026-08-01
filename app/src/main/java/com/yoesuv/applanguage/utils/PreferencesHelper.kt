package com.yoesuv.applanguage.utils

import android.content.Context
import androidx.core.content.edit

class PreferencesHelper(
    context: Context,
) {
    private val prefHelper = context.getSharedPreferences("pref_app", Context.MODE_PRIVATE)

    fun setString(
        key: String,
        value: String,
    ) {
        prefHelper.edit { putString(key, value) }
    }

    fun getString(key: String): String = prefHelper.getString(key, "") ?: ""
}
