package com.github.satoshun.example.maxline

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.helper.widget.Flow
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.MaxLineFragBinding

class MaxLineFragment : Fragment(R.layout.max_line_frag) {
  @SuppressLint("SetTextI18n")
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    val binding = MaxLineFragBinding.bind(view)

    binding.text1.text = "aaaaaaaaaaa"
    binding.text2.text = "bbbbbbb"
    binding.text3.text = "cccccccccc"
    binding.text4.text = "dddddddddddd"
    binding.text5.text = "eeeeee"
    binding.text6.text = "fffffffff"
    binding.text7.text = "ggggggggggg"
    binding.text8.text = "hhhhhhhhhhhh"
    binding.text9.text = "iiiii"
    binding.text10.text = "jjjjjjjjjj"
    binding.text11.text = "kkkk"
    binding.text12.text = "llllllllllllllll"
    binding.text13.text = "mmmmmmmmmm"

    binding.button.setOnClickListener {
      binding.text7.text = "HO"
    }
  }
}

class FlowMaxLine @JvmOverloads constructor(
  context: Context,
  attrs: AttributeSet? = null
) : Flow(context, attrs) {
  private val maxLine = 2

  override fun updatePreLayout(container: ConstraintLayout?) {
    super.updatePreLayout(container)

    val views = getViews(container)
    views.forEach { it.isVisible = true }
  }

  override fun updatePostLayout(container: ConstraintLayout?) {
    super.updatePostLayout(container)

    val views = getViews(container)

    var curLine = 0
    var curY = 0f
    views.forEach { view ->
      if (view.y > curY) {
        curLine += 1
        curY = view.y
      }
      if (curLine >= maxLine) {
        view.isGone = true
      }
    }
  }
}
