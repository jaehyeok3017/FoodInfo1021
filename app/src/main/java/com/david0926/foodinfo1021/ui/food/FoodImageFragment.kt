package com.david0926.foodinfo1021.ui.food

import android.os.Bundle
import com.david0926.foodinfo1021.R
import com.david0926.foodinfo1021.databinding.FragmentFoodImageBinding
import com.david0926.foodinfo1021.ui.common.BaseFragment

class FoodImageFragment : BaseFragment<FragmentFoodImageBinding>(R.layout.fragment_food_image) {

    companion object {
        private const val KEY_IMAGE_LINK = "imageLink"

        @JvmStatic
        fun newInstance(image: String) =
            FoodImageFragment().apply {
                arguments = Bundle().apply {
                    putString(KEY_IMAGE_LINK, image)
                }
            }
    }

    override fun init() {
        arguments?.let {
            binding.image = it.getString(KEY_IMAGE_LINK)
        }
    }
}