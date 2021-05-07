package com.bbm.foodservice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bbm.foodservice.databinding.FragmentOrderMainBinding
import com.bbm.foodservice.databinding.FragmentSecondLevelFoodBinding
import com.bbm.foodservice.dishes.MainDish.MainDish
import com.bbm.foodservice.dishes.Order

class SecondLevelFoodFragment : Fragment() {

    private lateinit var foodName: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentSecondLevelFoodBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_second_level_food,
            container,
            false
        )

        val secondLevelFragmentArgs by navArgs<SecondLevelFoodFragmentArgs>()
        foodName = secondLevelFragmentArgs.foodName

        var adp = ArrayAdapter.createFromResource(context!!, R.array.maindish_izgara_array, android.R.layout.simple_spinner_item)

        when(foodName){
            "Izgara" ->  adp = ArrayAdapter.createFromResource(context!!, R.array.maindish_izgara_array, android.R.layout.simple_spinner_item)
            "Kebab" -> adp = ArrayAdapter.createFromResource(context!!, R.array.maindish_kebab_array, android.R.layout.simple_spinner_item)
            "Pide" -> adp = ArrayAdapter.createFromResource(context!!, R.array.maindish_pide_array, android.R.layout.simple_spinner_item)
            "Sisler" -> adp = ArrayAdapter.createFromResource(context!!, R.array.maindish_sisler_array, android.R.layout.simple_spinner_item)
            "Serbetli" -> adp = ArrayAdapter.createFromResource(context!!, R.array.dessert_serbetli_array, android.R.layout.simple_spinner_item)
            "Sutlu" -> adp = ArrayAdapter.createFromResource(context!!, R.array.dessert_sutlu_array, android.R.layout.simple_spinner_item)
            "Hot" -> adp = ArrayAdapter.createFromResource(context!!, R.array.beverages_hot_array, android.R.layout.simple_spinner_item)
            "Normal" -> adp = ArrayAdapter.createFromResource(context!!, R.array.beverages_normal_array, android.R.layout.simple_spinner_item)
            "Sparkling" -> adp = ArrayAdapter.createFromResource(context!!, R.array.beverages_sparkling_array, android.R.layout.simple_spinner_item)
        }

        adp.also { adapter ->
                // Specify the layout to use when the list of choices appears
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                // Apply the adapter to the spinner
                binding.spinnerFood.adapter = adapter
        }

        binding.buttonAddFood.setOnClickListener {

            findNavController().navigate(SecondLevelFoodFragmentDirections.actionSecondLevelFoodFragmentToOrderMainFragment(binding.spinnerFood.selectedItem as String)) }
        return binding.root
    }
}