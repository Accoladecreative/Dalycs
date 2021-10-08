package com.accolade.dalycs.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import com.accolade.dalycs.R
import com.accolade.dalycs.databinding.FragmentSplash2Binding
import com.accolade.dalycs.databinding.FragmentSplashScreenBinding

class SplashScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentSplashScreenBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_splash_screen, container, false);
        /* binding.btnNext.setOnClickListener {findNavController().navigate(R.id.action_splash2Fragment_to_splash3Fragment)}
             binding.btnPrev.setOnClickListener {findNavController().navigate(R.id.action_splash2Fragment_to_splash1Fragment)}
 */


        val handler: Handler = Handler();

        handler.postDelayed(Runnable {
            kotlin.run {
                findNavController().navigate(R.id.action_splashScreen2_to_viewPager)
               /* val intent = Intent(this, OnboardingActivity::class.java)
                startActivity(intent)
                finish()*/
            }
        }, 3000)


        return binding.root;
    }


}



