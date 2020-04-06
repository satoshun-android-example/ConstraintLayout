package com.github.satoshun.example.gonewidth

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.GoneWidthFragBinding

class GoneWidthFragment : Fragment(R.layout.gone_width_frag) {
  private lateinit var binding: GoneWidthFragBinding

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding = GoneWidthFragBinding.bind(view)
  }
}
