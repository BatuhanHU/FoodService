package com.bbm.foodservice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bbm.foodservice.databinding.FragmentOrderMainBinding
import com.bbm.foodservice.dishes.Order


class OrderMainFragment : Fragment() {

    private lateinit var selectedFood: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentOrderMainBinding =  DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_order_main,
            container,
            false
        )

        val orderMainFragmentArgs by navArgs<OrderMainFragmentArgs>()
        selectedFood = orderMainFragmentArgs.selectedFood
        saveSpecial(selectedFood)
        updateFront(binding)

        ArrayAdapter.createFromResource(
            context!!,
            R.array.warmup_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            binding.warmupSpinner.adapter = adapter
        }
        binding.warmupSpinner.setSelection(warmup)
        var warmupFlag = false
        binding.warmupSpinner.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                if(warmupFlag){
                    val selectedItem = parent.getItemAtPosition(position).toString()
                    warmup = position
                }
                warmupFlag = true
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        ArrayAdapter.createFromResource(
            context!!,
            R.array.maindish_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            binding.maindishSpinner.adapter = adapter
        }
        binding.maindishSpinner.setSelection(mainDish)
        var mainFlag = false
        binding.maindishSpinner.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                if(mainFlag){
                    val selectedItem = parent.getItemAtPosition(position).toString()
                    mainDish = position
                    lastType = 1
                    findNavController().navigate(OrderMainFragmentDirections.actionOrderMainFragmentToSecondLevelFoodFragment(selectedItem))
                }
                mainFlag = true
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        ArrayAdapter.createFromResource(
            context!!,
            R.array.salad_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            binding.saladsSpinner.adapter = adapter
        }
        binding.saladsSpinner.setSelection(salad)
        var saladFlag = false
        binding.saladsSpinner.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                if(saladFlag){
                    val selectedItem = parent.getItemAtPosition(position).toString()
                    salad = position
                }
                saladFlag = true
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        ArrayAdapter.createFromResource(
            context!!,
            R.array.dessert_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            binding.dessertsSpinner.adapter = adapter
        }
        binding.dessertsSpinner.setSelection(dessert)
        var dessertFlag = false
        binding.dessertsSpinner.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                if(dessertFlag){
                    val selectedItem = parent.getItemAtPosition(position).toString()
                    dessert = position
                    lastType = 2
                    findNavController().navigate(OrderMainFragmentDirections.actionOrderMainFragmentToSecondLevelFoodFragment(selectedItem))
                }
                dessertFlag = true
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        ArrayAdapter.createFromResource(
            context!!,
            R.array.beverages_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            binding.beveragesSpinner.adapter = adapter
        }
        binding.beveragesSpinner.setSelection(beverage)
        var beveragesFlag = false
        binding.beveragesSpinner.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                if(beveragesFlag){
                    val selectedItem = parent.getItemAtPosition(position).toString()
                    beverage = position
                    lastType = 3
                    findNavController().navigate(OrderMainFragmentDirections.actionOrderMainFragmentToSecondLevelFoodFragment(selectedItem))
                }
                beveragesFlag = true
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        binding.buttonPlaceOrder.setOnClickListener {
            findNavController().navigate(OrderMainFragmentDirections.actionOrderMainFragmentToFinishOrderFragment(
                binding.warmupSpinner.selectedItem as String,
                binding.maindishSpinner.selectedItem as String,
                binding.saladsSpinner.selectedItem as String,
                binding.dessertsSpinner.selectedItem as String,
                binding.beveragesSpinner.selectedItem as String
            ))
        }

        return binding.root
    }

    fun saveSpecial(name: String){
        when(lastType){
            1 -> sMain = name
            2 -> sDessert = name
            3 -> sBeverage = name
        }
    }

    fun updateFront(binding: FragmentOrderMainBinding){
        if(sMain.isNotEmpty()) binding.textViewHiddenMain.visibility = View.VISIBLE
        if(sBeverage.isNotEmpty()) binding.textViewHiddenBeverage.visibility = View.VISIBLE
        if(sDessert.isNotEmpty()) binding.textViewHiddenDessert.visibility = View.VISIBLE

        binding.textViewHiddenMain.text = sMain
        binding.textViewHiddenBeverage.text = sBeverage
        binding.textViewHiddenDessert.text = sDessert
    }

    companion object{
        var warmup:Int = 0
        var mainDish:Int = 0
        var salad:Int = 0
        var beverage:Int = 0
        var dessert:Int = 0

        var sMain:String =""
        var sBeverage:String =""
        var sDessert:String =""

        var lastType = 0

    }
}