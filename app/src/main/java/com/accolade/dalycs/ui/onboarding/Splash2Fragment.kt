package com.accolade.dalycs.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.accolade.dalycs.R
import com.accolade.dalycs.databinding.FragmentSplash2Binding


class Splash2Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentSplash2Binding = DataBindingUtil.inflate(inflater,R.layout.fragment_splash2, container, false);
       /* binding.btnNext.setOnClickListener {findNavController().navigate(R.id.action_splash2Fragment_to_splash3Fragment)}
            binding.btnPrev.setOnClickListener {findNavController().navigate(R.id.action_splash2Fragment_to_splash1Fragment)}
*/
                return binding.root;
    }


}