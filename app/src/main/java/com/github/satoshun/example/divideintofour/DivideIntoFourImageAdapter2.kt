package com.github.satoshun.example.divideintofour

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.api.clear
import coil.api.load
import com.github.satoshun.example.databinding.DivideIntoFourItem2Binding

class DivideIntoFourImageAdapter2 : ListAdapter<CellData, DivideIntoFourViewHolder2>(
  object : DiffUtil.ItemCallback<CellData>() {
    override fun areItemsTheSame(oldItem: CellData, newItem: CellData): Boolean {
      return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: CellData, newItem: CellData): Boolean {
      return oldItem == newItem
    }
  }
) {
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DivideIntoFourViewHolder2 {
    return DivideIntoFourViewHolder2(
      DivideIntoFourItem2Binding.inflate(
        LayoutInflater.from(parent.context),
        parent,
        false
      )
    )
  }

  override fun onBindViewHolder(holder: DivideIntoFourViewHolder2, position: Int) {
    val data = getItem(position)

    when {
      data.image1 == null -> {
        with(holder.binding) {
          topLeft.isGone = true
          topRight.isGone = true
          bottomLeft.isGone = true
          bottomRight.isGone = true
          left.isGone = true
          right.isGone = true
          single.isVisible = true

          single.clear()
        }
      }
      data.image2 == null -> {
        with(holder.binding) {
          topLeft.isGone = true
          topRight.isGone = true
          bottomLeft.isGone = true
          bottomRight.isGone = true
          left.isGone = true
          right.isGone = true
          single.isVisible = true

          single.load(data.image1)
        }
      }
      data.image3 == null -> {
        with(holder.binding) {
          topLeft.isGone = true
          topRight.isGone = true
          bottomLeft.isGone = true
          bottomRight.isGone = true
          left.isVisible = true
          right.isVisible = true
          single.isGone = true

          left.load(data.image1)
          right.load(data.image2)
        }
      }
      else -> {
        with(holder.binding) {
          topLeft.isVisible = true
          topRight.isVisible = true
          bottomLeft.isVisible = true
          bottomRight.isVisible = true
          left.isGone = true
          right.isGone = true
          single.isGone = true

          topLeft.load(data.image1)
          topRight.load(data.image2)
          bottomLeft.load(data.image3)
          bottomRight.load(data.image4)
        }
      }
    }

    with(holder.binding) {
      name.text = data.name
      userId.text = data.id
      date.text = data.date
      message.text = data.message
    }
  }
}

class DivideIntoFourViewHolder2(
  val binding: DivideIntoFourItem2Binding
) : RecyclerView.ViewHolder(binding.root)
