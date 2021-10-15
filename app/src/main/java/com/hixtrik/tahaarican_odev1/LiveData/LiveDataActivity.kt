package com.hixtrik.tahaarican_odev1.LiveData

import android.content.Context
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doOnTextChanged
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.hixtrik.tahaarican_odev1.R
import com.hixtrik.tahaarican_odev1.databinding.ActivityLiveDataBinding

class LiveDataActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLiveDataBinding

    private lateinit var viewModel: LiveDataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_live_data)

        viewModel = ViewModelProvider(this@LiveDataActivity).get(LiveDataViewModel::class.java)


        binding.edt.doOnTextChanged { text, start, before, count -> viewModel.setText(text.toString()) }

        viewModel.textLiveData.observe(this, Observer {
            binding.adventPro.text = it
            binding.aguafinaScript.text = it
            binding.annieUseYourTelescope.text = it
            binding.arizonia.text = it
            binding.architectsDaughter.text = it
            binding.audiowide.text = it
            binding.bungeeShade.text = it
            binding.cherryCreamSoda.text = it
            binding.diplomata.text = it
            binding.lilyScriptOne.text = it
            binding.ultra.text = it
        })
}

    }