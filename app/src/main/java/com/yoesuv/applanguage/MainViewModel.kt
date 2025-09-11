package com.yoesuv.applanguage

import android.app.Activity
import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.yoesuv.applanguage.utils.dialogChangeLanguage

class MainViewModel(application: Application) : AndroidViewModel(application) {

    var title = MutableLiveData("")

    fun setup(activity: Activity) {
        title.postValue(activity.getString(R.string.app_name))
    }

    fun changeLanguage(activity: Activity) {
        dialogChangeLanguage(activity, {
            // English
            val tag = "en"
            MyApp.prefHelper?.setString("language", tag)
            AppCompatDelegate.setApplicationLocales(LocaleListCompat.forLanguageTags(tag))
        }, {
            // Indonesian (BCP-47 tag is "id")
            val tag = "id"
            MyApp.prefHelper?.setString("language", tag)
            AppCompatDelegate.setApplicationLocales(LocaleListCompat.forLanguageTags(tag))
        })
    }

}