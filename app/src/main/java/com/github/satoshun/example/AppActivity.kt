package com.github.satoshun.example

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.centerwithdivider.CenterWithDividerActivity

class AppActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.app_act)

    findViewById<View>(R.id.center_with_divider).setOnClickListener {
      startActivity(
        Intent(this@AppActivity, CenterWithDividerActivity::class.java)
      )
    }
  }
}
