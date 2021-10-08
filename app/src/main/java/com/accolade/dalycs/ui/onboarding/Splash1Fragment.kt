package com.accolade.dalycs.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.accolade.dalycs.R
import com.accolade.dalycs.databinding.FragmentSplash1Binding

class Splash1Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentSplash1Binding = DataBindingUtil.inflate(inflater,R.layout.fragment_splash1, container, false);

        /*binding.btnNext.setOnClickListener {findNavController().navigate(R.id.action_splash1Fragment_to_splash2Fragment)
        }*/

        return binding.root;
    }


}