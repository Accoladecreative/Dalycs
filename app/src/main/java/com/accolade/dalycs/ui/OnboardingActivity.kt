package com.accolade.dalycs.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.accolade.dalycs.R

class OnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_swipes)
        supportActionBar?.hide()
    }
}