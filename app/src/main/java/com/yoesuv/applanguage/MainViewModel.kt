package com.yoesuv.applanguage

import android.app.Activity
import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.yoesuv.applanguage.utils.dialogChangeLanguage

class MainViewModel(application: Application) : AndroidViewModel(application) {

    var title = MutableLiveData(application.getString(R.string.app_name))

    fun changeLanguage(activity: Activity) {
        dialogChangeLanguage(activity, {
            Log.d("result_debug", "MainViewModel # choose english")
        }, {
            Log.d("result_debug", "MainViewModel # choose indonesia")
        })
    }

}