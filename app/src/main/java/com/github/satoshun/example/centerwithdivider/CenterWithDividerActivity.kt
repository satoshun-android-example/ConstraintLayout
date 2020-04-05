package com.github.satoshun.example.centerwithdivider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.CenterWithDividerActBinding
import com.github.satoshun.example.getContentView

class CenterWithDividerActivity : AppCompatActivity(R.layout.center_with_divider_act) {
  private lateinit var binding: CenterWithDividerActBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = CenterWithDividerActBinding.bind(getContentView())
    setSupportActionBar(binding.toolbar)
  }
}
