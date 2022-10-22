package com.david0926.foodinfo1021.ui.onboard

import android.os.Bundle
import com.david0926.foodinfo1021.R
import com.david0926.foodinfo1021.data.model.Onboard
import com.david0926.foodinfo1021.databinding.FragmentOnboardBinding
import com.david0926.foodinfo1021.ui.common.BaseFragment

class OnboardFragment : BaseFragment<FragmentOnboardBinding>(R.layout.fragment_onboard) {

    companion object {
        private const val KEY_ONBOARD = "onboard"

        @JvmStatic
        fun newInstance(onboard: Onboard) =
            OnboardFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(KEY_ONBOARD, onboard)
                }
            }
    }

    override fun init() {
        arguments?.let {
            binding.onboard = it.getSerializable(KEY_ONBOARD) as Onboard
        }
    }
}