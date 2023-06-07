package com.yoesuv.applanguage.utils

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

abstract class BaseActivity : AppCompatActivity() {

    override fun attachBaseContext(newBase: Context?) {
        val context = LanguageContextWrapper.wrap(newBase, Locale("en"));
        super.attachBaseContext(context)
    }

}