package com.yoesuv.applanguage.utils

import android.content.Context
import android.content.ContextWrapper
import android.os.LocaleList
import java.util.Locale

class LanguageContextWrapper(base: Context?) : ContextWrapper(base) {

    companion object {
        fun wrap(context: Context?, newLocale: Locale): LanguageContextWrapper {
            var mContext = context
            mContext?.let { ctx ->
                val res = ctx.resources
                val configuration = res.configuration

                configuration.setLocale(newLocale)
                val localeList = LocaleList(newLocale)
                LocaleList.setDefault(localeList)
                mContext = ctx.createConfigurationContext(configuration)
            }
            return LanguageContextWrapper(mContext)
        }
    }

}