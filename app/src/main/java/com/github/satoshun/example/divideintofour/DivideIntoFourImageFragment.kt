package com.github.satoshun.example.divideintofour

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import coil.api.load
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.DivideIntoFourImageBinding

class DivideIntoFourImageFragment : Fragment(R.layout.divide_into_four_image) {
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    val binding = DivideIntoFourImageBinding.bind(view)

    val data = CellData(
      image1 = "https://pbs.twimg.com/media/ESGIm9_UUAA4TmJ?format=jpg&name=360x360",
      image2 = "https://pbs.twimg.com/media/ES_wWaEUcAAmUe1?format=jpg&name=large",
      image3 = "https://pbs.twimg.com/media/ER7Jud3U8AALg5Q?format=jpg&name=large",
      image4 = "https://pbs.twimg.com/media/ERmlHYEU8AANNQ4?format=jpg&name=large",
      name = "satoshun",
      id = "@stsn_jp",
      date = "01/01",
      message = "こんにちは"
    )
    binding.leftTop.load(data.image1)
    binding.rightTop.load(data.image2)
    binding.leftBottom.load(data.image3)
    binding.rightBottom.load(data.image4)

    binding.name.text = data.name
    binding.userId.text = data.id
    binding.date.text = data.date
    binding.message.text = data.message
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
