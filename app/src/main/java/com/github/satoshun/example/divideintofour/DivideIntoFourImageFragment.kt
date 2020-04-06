package com.github.satoshun.example.divideintofour

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.DivideIntoFourImageFragBinding

class DivideIntoFourImageFragment : Fragment(R.layout.divide_into_four_image_frag) {
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    val binding = DivideIntoFourImageFragBinding.bind(view)

    val data = listOf(
      CellData(
        image1 = "https://pbs.twimg.com/media/ESGIm9_UUAA4TmJ?format=jpg&name=360x360",
        image2 = "https://pbs.twimg.com/media/ES_wWaEUcAAmUe1?format=jpg&name=large",
        image3 = "https://pbs.twimg.com/media/ER7Jud3U8AALg5Q?format=jpg&name=large",
        image4 = "https://pbs.twimg.com/media/ERmlHYEU8AANNQ4?format=jpg&name=large",
        name = "satoshun",
        id = "@stsn_jp",
        date = "01/01",
        message = "こんにちは"
      ),
      CellData(
        image1 = "https://pbs.twimg.com/media/ESGIm9_UUAA4TmJ?format=jpg&name=360x360",
        image2 = "https://pbs.twimg.com/media/ES_wWaEUcAAmUe1?format=jpg&name=large",
        image3 = "https://pbs.twimg.com/media/ER7Jud3U8AALg5Q?format=jpg&name=large",
        image4 = "https://pbs.twimg.com/media/ERmlHYEU8AANNQ4?format=jpg&name=large",
        name = "too too too too too too too long name",
        id = "@stsn_jp",
        date = "01/01",
        message = "こんにちは。こんばんは。こんにちは。こんばんは。こんにちは。こんばんは。こんにちは。こんばんは。こんにちは。こんばんは。"
      )
    )

    binding.recycler.layoutManager = LinearLayoutManager(requireContext())
    binding.recycler.adapter = DivideIntoFourImageAdapter2().apply {
      submitList(data)
    }
  }
}

data class CellData(
  val image1: String,
  val image2: String,
  val image3: String,
  val image4: String,
  val name: String,
  val id: String,
  val date: String,
  val message: String
)
