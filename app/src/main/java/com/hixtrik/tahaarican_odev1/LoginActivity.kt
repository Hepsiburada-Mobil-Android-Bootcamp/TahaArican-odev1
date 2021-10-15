package com.hixtrik.tahaarican_odev1

import android.content.Intent
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hixtrik.tahaarican_odev1.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        setTitleGradient()
        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java).apply {
            })
        }

    }

    private fun setTitleGradient() {
        val paint = binding.title.paint
        val width = paint.measureText(binding.title.text.toString())
        val textShader: Shader = LinearGradient(
            0f, 0f, width, binding.title.textSize, intArrayOf(
                Color.parseColor("#15BE77"),
                Color.parseColor("#53E88B"),
            ), null, Shader.TileMode.REPEAT
        )
        binding.title.paint.shader = textShader
    }
}