package com.yoesuv.applanguage

import android.app.Activity
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainViewModel(application: Application) : AndroidViewModel(application) {

    var title = MutableLiveData(application.getString(R.string.app_name))

    fun changeLanguage(activity: Activity) {
        MaterialAlertDialogBuilder(activity, R.style.DialogTheme)
            .setView(R.layout.dialog_change_language)
            .show()
    }

}