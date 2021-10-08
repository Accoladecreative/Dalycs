package com.accolade.dalycs.ui.plans.newplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.accolade.dalycs.R
import com.accolade.dalycs.databinding.ActivityNewPlanBinding
import com.accolade.dalycs.ui.plans.Plans

class NewPlanActivity : AppCompatActivity() {

    lateinit var binding: ActivityNewPlanBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_new_plan)
        supportActionBar?.title= "Add New Plan"


        binding.btnAddPlan.setOnClickListener {
            startActivity(Intent(this, Plans::class.java))
        }


    }
}