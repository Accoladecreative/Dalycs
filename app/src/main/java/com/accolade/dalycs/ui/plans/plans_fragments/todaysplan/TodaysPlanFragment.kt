package com.accolade.dalycs.ui.plans.plans_fragments.todaysplan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.accolade.dalycs.R

class TodaysPlanFragment : Fragment() {

    private lateinit var homeViewModel: TodaysPlanViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(TodaysPlanViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_todays_plan, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}