package com.github.satoshun.example

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.github.satoshun.example.centerwithdivider.CenterWithDividerActivity
import com.github.satoshun.example.databinding.AppActBinding
import com.github.satoshun.example.gonewidth.GoneWidthActivity
import com.github.satoshun.example.trimview.TrimExpandedViewActivity

class AppActivity : AppCompatActivity() {
  private lateinit var binding: AppActBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.app_act)

    binding.centerWithDivider.setOnClickListener {
      startActivity(
        Intent(this@AppActivity, CenterWithDividerActivity::class.java)
      )
    }

    binding.goneWidth.setOnClickListener {
      startActivity(
        Intent(this@AppActivity, GoneWidthActivity::class.java)
      )
    }

    binding.trim.setOnClickListener {
      startActivity(
        Intent(this@AppActivity, TrimExpandedViewActivity::class.java)
      )
    }
  }
}
