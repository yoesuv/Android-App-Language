package com.yoesuv.applanguage.utils

import android.content.Context
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.yoesuv.applanguage.R
import com.yoesuv.applanguage.databinding.DialogChangeLanguageBinding

fun dialogChangeLanguage(context: Context, onEnglish: () -> Unit, onIndonesia: () -> Unit) {
    var alertDialog: AlertDialog? = null
    val builder: MaterialAlertDialogBuilder?
    val binding = DialogChangeLanguageBinding.inflate(LayoutInflater.from(context))
    binding.tvDialogEnglish.setOnClickListener {
        alertDialog?.dismiss()
        onEnglish()
    }
    binding.tvDialogIndonesia.setOnClickListener {
        alertDialog?.dismiss()
        onIndonesia()
    }
    builder = MaterialAlertDialogBuilder(context, R.style.DialogTheme)
        .setView(binding.root)
    alertDialog = builder.show()
}