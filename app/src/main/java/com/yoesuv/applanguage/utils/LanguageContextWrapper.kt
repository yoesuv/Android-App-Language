package com.yoesuv.applanguage.utils

import android.content.Context
import android.content.ContextWrapper
import android.os.Build
import android.os.LocaleList
import java.util.Locale

class LanguageContextWrapper(base: Context?) : ContextWrapper(base) {

    companion object {
        fun wrap(context: Context?, newLocale: Locale): LanguageContextWrapper {
            var mContext = context
            mContext?.let { ctx ->
                val res = ctx.resources
                val configuration = res.configuration

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    configuration.setLocale(newLocale)
                    val localeList = LocaleList(newLocale)
                    LocaleList.setDefault(localeList)
                    mContext = ctx.createConfigurationContext(configuration)
                } else {
                    configuration.locale = newLocale
                    res.updateConfiguration(configuration, res.displayMetrics)
                }
            }
            return LanguageContextWrapper(mContext)
        }
    }

}