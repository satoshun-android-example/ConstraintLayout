package com.github.satoshun.example.gonewidth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.GoneWidthActBinding
import com.github.satoshun.example.getContentView

class GoneWidthActivity : AppCompatActivity(R.layout.gone_width_act) {
  private lateinit var binding: GoneWidthActBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = GoneWidthActBinding.bind(getContentView())
    setSupportActionBar(binding.toolbar)
  }
}
