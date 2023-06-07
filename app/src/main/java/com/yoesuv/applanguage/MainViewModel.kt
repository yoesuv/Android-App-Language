package com.yoesuv.applanguage

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel(application: Application) : AndroidViewModel(application) {

    var title = MutableLiveData(application.getString(R.string.app_name))

}