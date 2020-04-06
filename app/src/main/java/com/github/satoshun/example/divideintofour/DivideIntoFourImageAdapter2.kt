package com.github.satoshun.example.divideintofour

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
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
    with(holder.binding) {
      topLeft.load(data.image1)
      topRight.load(data.image2)
      bottomLeft.load(data.image3)
      bottomRight.load(data.image4)

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
