package com.github.satoshun.example.circleimagesequence

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.CircleImageSequenceFragBinding
import com.github.satoshun.example.databinding.CircleImageSequenceItemBinding
import com.github.satoshun.example.databinding.DivideIntoFourItemBinding
import com.github.satoshun.example.divideintofour.CellData

class CircleImageSequenceFragment : Fragment(R.layout.circle_image_sequence_frag) {
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    val binding = CircleImageSequenceFragBinding.bind(view)
    binding.recycler.layoutManager = LinearLayoutManager(requireContext())
    val adapter = CircleImageSequenceAdapter().apply {
      submitList(
        listOf(
          CircleImageSequence(
            name = "Hello World",
            image1 = "https://pbs.twimg.com/media/EThSmPiUYAEwNxB?format=png&name=medium",
            image2 = "https://pbs.twimg.com/media/ES_wWaEUcAAmUe1?format=jpg&name=large",
            image3 = "https://pbs.twimg.com/media/ESU2e78U0AApKk-?format=jpg&name=900x900",
            image4 = "https://pbs.twimg.com/profile_images/1254338014605570054/TTmM7svb_400x400.jpg"
          ),
          CircleImageSequence(
            name = "Hello World",
            image1 = null,
            image2 = "https://pbs.twimg.com/media/ES_wWaEUcAAmUe1?format=jpg&name=large",
            image3 = "https://pbs.twimg.com/media/ESU2e78U0AApKk-?format=jpg&name=900x900",
            image4 = "https://pbs.twimg.com/profile_images/1254338014605570054/TTmM7svb_400x400.jpg"
          ),
          CircleImageSequence(
            name = "Hello World",
            image1 = null,
            image2 = null,
            image3 = "https://pbs.twimg.com/media/ESU2e78U0AApKk-?format=jpg&name=900x900",
            image4 = "https://pbs.twimg.com/profile_images/1254338014605570054/TTmM7svb_400x400.jpg"
          ),
          CircleImageSequence(
            name = "Hello World",
            image1 = null,
            image2 = null,
            image3 = null,
            image4 = "https://pbs.twimg.com/profile_images/1254338014605570054/TTmM7svb_400x400.jpg"
          )
        )
      )
    }
    binding.recycler.adapter = adapter
  }
}

internal class CircleImageSequenceAdapter :
  ListAdapter<CircleImageSequence, CircleImageSequenceViewHolder>(
    object : DiffUtil.ItemCallback<CircleImageSequence>() {
      override fun areItemsTheSame(
        oldItem: CircleImageSequence,
        newItem: CircleImageSequence
      ): Boolean {
        return oldItem.name == newItem.name
      }

      override fun areContentsTheSame(
        oldItem: CircleImageSequence,
        newItem: CircleImageSequence
      ): Boolean {
        return oldItem == newItem
      }
    }
  ) {
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CircleImageSequenceViewHolder {
    return CircleImageSequenceViewHolder(
      CircleImageSequenceItemBinding.inflate(
        LayoutInflater.from(parent.context),
        parent,
        false
      )
    )
  }

  override fun onBindViewHolder(holder: CircleImageSequenceViewHolder, position: Int) {
    val item = getItem(position)
    with(holder.binding) {
      name.text = item.name
      image1.load(item.image1)
      image1.isVisible = item.image1 != null

      image2.load(item.image2)
      image2.isVisible = item.image2 != null

      image3.load(item.image3)
      image3.isVisible = item.image3 != null

      image4.load(item.image4)
    }
  }
}

class CircleImageSequenceViewHolder(
  val binding: CircleImageSequenceItemBinding
) : RecyclerView.ViewHolder(binding.root)

internal data class CircleImageSequence(
  val name: String,
  val image1: String?,
  val image2: String?,
  val image3: String?,
  val image4: String
)
