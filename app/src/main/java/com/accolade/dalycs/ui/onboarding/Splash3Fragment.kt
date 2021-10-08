package com.accolade.dalycs.ui.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.accolade.dalycs.R
import com.accolade.dalycs.databinding.FragmentSplash3Binding
import com.accolade.dalycs.ui.UserAuthActivity


class Splash3Fragment : Fragment() {


       override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
    ): View? {

        val binding:FragmentSplash3Binding = DataBindingUtil.inflate(inflater,R.layout.fragment_splash3, container, false);
        binding.btnNext.setOnClickListener {
            startActivity(Intent(activity,UserAuthActivity::class.java))

        }
      /* binding.btnPrev.setOnClickListener {findNavController().navigate(R.id.action_splash3Fragment_to_splash2Fragment)}
 */
        return binding.root;
    }


}