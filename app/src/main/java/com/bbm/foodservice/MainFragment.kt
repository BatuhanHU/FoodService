package com.bbm.foodservice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.bbm.foodservice.R
import com.bbm.foodservice.databinding.FragmentMainBinding
import com.bbm.foodservice.dishes.Order

class MainFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentMainBinding =  DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_main,
            container,
            false)

        binding.button.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToOrderMainFragment("-1"))
        }
        return binding.root
    }


}