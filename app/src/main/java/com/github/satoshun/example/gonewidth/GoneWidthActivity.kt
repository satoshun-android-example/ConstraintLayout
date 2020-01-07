package com.github.satoshun.example.gonewidth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.GoneWidthActBinding

class GoneWidthActivity : AppCompatActivity() {

  private lateinit var binding: GoneWidthActBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.gone_width_act)
    setSupportActionBar(binding.toolbar)
  }
}
