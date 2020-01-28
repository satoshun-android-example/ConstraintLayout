package com.github.satoshun.example.trimview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.TrimViewActBinding

class TrimExpandedViewActivity : AppCompatActivity() {

  private lateinit var binding: TrimViewActBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.trim_view_act)
    setSupportActionBar(binding.toolbar)
  }
}