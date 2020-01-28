package com.github.satoshun.example.trimview

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.util.DisplayMetrics
import androidx.constraintlayout.widget.ConstraintHelper
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isGone
import androidx.core.view.updateLayoutParams


class HideHelper @JvmOverloads constructor(
  context: Context,
  attrs: AttributeSet? = null,
  defStyleAttr: Int = 0
) : ConstraintHelper(context, attrs, defStyleAttr) {
  override fun updatePostMeasure(container: ConstraintLayout?) {
    super.updatePostLayout(container)
    val views = getViews(container)

    val target = views.getOrNull(0) ?: return
    if (target.isGone) {
      return
    }

    val left = views.getOrNull(1) ?: return
    val right = views.getOrNull(2) ?: return

    val totalWidth = left.measuredWidth + target.measuredWidth + right.measuredWidth

    val displayMetrics = DisplayMetrics()
    (context as Activity).windowManager
      .defaultDisplay
      .getMetrics(displayMetrics)

    if (displayMetrics.widthPixels < totalWidth) {
      target.isGone = true
      target.updateLayoutParams { width = 0 }
    }
  }
}