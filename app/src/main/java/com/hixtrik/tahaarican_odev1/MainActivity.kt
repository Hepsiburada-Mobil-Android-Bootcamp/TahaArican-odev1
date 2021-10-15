package com.hixtrik.tahaarican_odev1

import android.content.Intent
import android.os.Bundle
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hixtrik.tahaarican_odev1.LiveData.LiveDataActivity
import com.hixtrik.tahaarican_odev1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btn.setOnClickListener {
            startActivity(Intent(this, LiveDataActivity::class.java).apply {
            })
        }
    }

}


