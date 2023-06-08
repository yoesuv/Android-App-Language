package com.yoesuv.applanguage.utils

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.yoesuv.applanguage.MyApp
import java.util.Locale

abstract class BaseActivity : AppCompatActivity() {

    override fun attachBaseContext(newBase: Context?) {
        val strLocale: String = MyApp.prefHelper?.getString("language") ?: "en"
        val context = LanguageContextWrapper.wrap(newBase, Locale(strLocale))
        super.attachBaseContext(context)
    }

}