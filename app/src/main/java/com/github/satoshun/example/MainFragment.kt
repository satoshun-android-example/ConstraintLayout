package com.github.satoshun.example

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.github.satoshun.example.databinding.MainFragBinding

class MainFragment : Fragment(R.layout.main_frag) {
  private val binding: MainFragBinding get() = MainFragBinding.bind(view!!)

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    binding.sequence.setOnClickListener {
      findNavController().navigate(MainFragmentDirections.navMainToCircleImageSequence())
    }
    binding.divideIntoFourImage.setOnClickListener {
      findNavController().navigate(MainFragmentDirections.navMainToDivideIntoFourImage())
    }
    binding.centerWithDivider.setOnClickListener {
      findNavController().navigate(MainFragmentDirections.navMainToCenterWithDivider())
    }
    binding.goneWidth.setOnClickListener {
      findNavController().navigate(MainFragmentDirections.navMainToGoneWidth())
    }
    binding.trim.setOnClickListener {
      findNavController().navigate(MainFragmentDirections.navMainToTrim())
    }
    binding.maxLine.setOnClickListener {
      findNavController().navigate(MainFragmentDirections.navMainToMaxLine())
    }
  }
}
