package com.github.satoshun.example.trimview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.TrimViewActBinding
import com.github.satoshun.example.getContentView

class TrimExpandedViewActivity : AppCompatActivity(R.layout.trim_view_act) {
  private lateinit var binding: TrimViewActBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = TrimViewActBinding.bind(getContentView())
    setSupportActionBar(binding.toolbar)
  }
}
