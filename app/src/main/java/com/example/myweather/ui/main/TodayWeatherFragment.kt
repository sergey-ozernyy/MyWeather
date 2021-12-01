package com.example.myweather.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.myweather.R
import com.example.myweather.databinding.MainFragmentBinding

class TodayWeatherFragment : Fragment() {



    companion object {
        fun newInstance() = TodayWeatherFragment()
    }

    private lateinit var viewModel: TodayWeatherViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding:MainFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
        viewModel = ViewModelProvider(this).get(TodayWeatherViewModel::class.java)
        binding.viewmodel = viewModel

        val view = binding.root

        val goToWeekButton = view.findViewById<View>(R.id.go_to_week)
        goToWeekButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_weekWeatherFragment))



        return view
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TodayWeatherViewModel::class.java)
        // TODO: Use the ViewModel
    }

}