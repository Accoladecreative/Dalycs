package com.accolade.dalycs.ui.plans.plans_fragments.doneplans

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.accolade.dalycs.R

class AccomplishedPlansFragment : Fragment() {

    companion object {
        fun newInstance() = AccomplishedPlansFragment()
    }

    private lateinit var viewModel: AccomplishedPlansViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.accomplished_plans_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AccomplishedPlansViewModel::class.java)
        // TODO: Use the ViewModel
    }

}