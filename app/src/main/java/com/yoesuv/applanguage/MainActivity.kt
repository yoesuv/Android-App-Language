package com.yoesuv.applanguage

import android.graphics.Color
import android.os.Bundle
import androidx.activity.SystemBarStyle
import androidx.activity.enableEdgeToEdge
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.yoesuv.applanguage.databinding.ActivityMainBinding
import com.yoesuv.applanguage.utils.AppHelper
import com.yoesuv.applanguage.utils.BaseActivity

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (AppHelper.isVanillaIceCreamAndUp()) {
            enableEdgeToEdge(statusBarStyle = SystemBarStyle.dark(Color.TRANSPARENT))
        }

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        binding.main = viewModel
        viewModel.setup(this)

        setupToolbar()
        setupButton()

        if (AppHelper.isVanillaIceCreamAndUp()) {
            AppHelper.insetsPadding(binding.clMain, top = true, color = getColor(R.color.teal))
            AppHelper.insetsPadding(binding.llMain, bottom = true)
        }
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.toolbarMain)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

    private fun setupButton() {
        binding.btnChangeLanguage.setOnClickListener {
            viewModel.changeLanguage(this)
        }
    }

}