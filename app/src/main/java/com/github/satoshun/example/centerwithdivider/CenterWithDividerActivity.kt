package com.github.satoshun.example.centerwithdivider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.CenterWithDividerActBinding

class CenterWithDividerActivity : AppCompatActivity() {

  private lateinit var binding: CenterWithDividerActBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.center_with_divider_act)
    setSupportActionBar(binding.toolbar)
  }
}
