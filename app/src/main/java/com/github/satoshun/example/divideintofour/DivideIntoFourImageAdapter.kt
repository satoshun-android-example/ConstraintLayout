package com.github.satoshun.example.divideintofour

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.github.satoshun.example.databinding.DivideIntoFourItemBinding

class DivideIntoFourImageAdapter : ListAdapter<CellData, DivideIntoFourViewHolder>(
  object : DiffUtil.ItemCallback<CellData>() {
    override fun areItemsTheSame(oldItem: CellData, newItem: CellData): Boolean {
      return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: CellData, newItem: CellData): Boolean {
      return oldItem == newItem
    }
  }
) {
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DivideIntoFourViewHolder {
    return DivideIntoFourViewHolder(
      DivideIntoFourItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )
  }

  override fun onBindViewHolder(holder: DivideIntoFourViewHolder, position: Int) {
    val data = getItem(position)
    with(holder.binding) {
      leftTop.load(data.image1)
      rightTop.load(data.image2)
      leftBottom.load(data.image3)
      rightBottom.load(data.image4)

      name.text = data.name
      userId.text = data.id
      date.text = data.date
      message.text = data.message
    }
  }
}

class DivideIntoFourViewHolder(
  val binding: DivideIntoFourItemBinding
) : RecyclerView.ViewHolder(binding.root)
