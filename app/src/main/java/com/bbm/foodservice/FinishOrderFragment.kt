package com.bbm.foodservice

import android.os.Bundle
import android.os.CountDownTimer
import android.os.SystemClock
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bbm.foodservice.databinding.FragmentFinishOrderBinding
import com.bbm.foodservice.dishes.Order
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.math.max


class FinishOrderFragment : Fragment() {

    private lateinit var main: String
    private lateinit var warmup: String
    private lateinit var salad: String
    private lateinit var dessert: String
    private lateinit var beverage: String
    private lateinit var order:Order
    private var totalCost = 0.0
    private var time = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentFinishOrderBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_finish_order,
            container,
            false
        )

        val finishOrderArgs by navArgs<FinishOrderFragmentArgs>()
        main = finishOrderArgs.mainDish
        warmup = finishOrderArgs.warmup
        salad = finishOrderArgs.salad
        dessert = finishOrderArgs.dessert
        beverage = finishOrderArgs.beverage

        order = Order()
        order.prepareOrder(
            main,
            OrderMainFragment.sMain,
            warmup,
            salad,
            dessert,
            OrderMainFragment.sDessert,
            beverage,
            OrderMainFragment.sBeverage
        )

        prepareMainDish(binding)
        prepareBeverage(binding)
        prepareDessert(binding)
        prepareSalad(binding)
        prepareWarmup(binding)
        prepareLast(binding)


        binding.buttonOrder.setOnClickListener {
            GlobalScope.launch {
                startCountdown(binding)
            }
        }
        return binding.root
    }


    private fun prepareMainDish(binding: FragmentFinishOrderBinding){
        binding.textViewMainDish.text = main
        binding.textViewMainDish2.text = OrderMainFragment.sMain
        binding.textViewMainDishI.text = ""
        if (order.maindish != null) {
            val builder = StringBuilder()
            order.maindish.ingredients.forEach {
                builder.append(it)
                builder.append(" ,")
            }
            builder.deleteCharAt(builder.length - 1)
            binding.textViewMainDishI.text = builder.toString()

            binding.textViewMainDishCost.text = "${order.maindish.cost} $"
            binding.textViewMainDishTime.text = "${order.maindish.time} Min"

            totalCost += order.maindish.cost
            time = max(time, order.maindish.time)
        } else {
            binding.textViewMainDishCost.text = "0 $"
            binding.textViewMainDishTime.text = "0 Min"
        }
    }

    private fun prepareDessert(binding: FragmentFinishOrderBinding){
        binding.textViewDessert.text = dessert
        binding.textViewDessert2.text = OrderMainFragment.sDessert
        binding.textViewDessertI.text = ""
        if (order.dessert != null) {
            val builder = StringBuilder()
            order.dessert.ingredients.forEach {
                builder.append(it)
                builder.append(" ,")
            }
            builder.deleteCharAt(builder.length - 1)
            binding.textViewDessertI.text = builder.toString()

            binding.textViewDessertCost.text = "${order.dessert.cost} $"
            binding.textViewDessertTime.text = "${order.dessert.time} Min"

            totalCost += order.dessert.cost
            time = max(time, order.dessert.time)
        } else {
            binding.textViewDessertCost.text = "0 $"
            binding.textViewDessertTime.text = "0 Min"
        }
    }

    private fun prepareBeverage(binding: FragmentFinishOrderBinding){
        binding.textViewBeverage.text = beverage
        binding.textViewBeverage2.text = OrderMainFragment.sBeverage
        binding.textViewBeverageI.text = ""
        if (order.beverage != null) {
            val builder = StringBuilder()
            order.beverage.ingredients.forEach {
                builder.append(it)
                builder.append(" ,")
            }
            builder.deleteCharAt(builder.length - 1)
            binding.textViewBeverageI.text = builder.toString()

            binding.textViewBeverageCost.text = "${order.beverage.cost} $"
            binding.textViewBeverageTime.text = "${order.beverage.time} Min"

            totalCost += order.beverage.cost
            time = max(time, order.beverage.time)
        } else {
            binding.textViewBeverageCost.text = "0 $"
            binding.textViewBeverageTime.text = "0 Min"
        }
    }

    private fun prepareWarmup(binding: FragmentFinishOrderBinding){
        binding.textViewWarmUp.text = warmup
        binding.textViewWarmUpI.text = ""
        if (order.warmup != null) {
            val builder = StringBuilder()
            order.warmup.ingredients.forEach {
                builder.append(it)
                builder.append(" ,")
            }
            builder.deleteCharAt(builder.length - 1)
            binding.textViewWarmUpI.text = builder.toString()

            binding.textViewWarmUpCost.text = "${order.warmup.cost} $"
            binding.textViewWarmUpTime.text = "${order.warmup.time} Min"

            totalCost += order.warmup.cost
            time = max(time, order.warmup.time)
        } else {
            binding.textViewWarmUpCost.text = "0 $"
            binding.textViewWarmUpTime.text = "0 Min"
        }
    }

    private fun prepareSalad(binding: FragmentFinishOrderBinding){
        binding.textViewSalad.text = salad
        binding.textViewSaladI.text = ""
        if (order.salad != null) {
            val builder = StringBuilder()
            order.salad.ingredients.forEach {
                builder.append(it)
                builder.append(" ,")
            }
            builder.deleteCharAt(builder.length - 1)
            binding.textViewSaladI.text = builder.toString()

            binding.textViewSaladCost.text = "${order.salad.cost} $"
            binding.textViewSaladTime.text = "${order.salad.time} Min"

            totalCost += order.salad.cost
            time = max(time, order.salad.time)
        } else {
            binding.textViewSaladCost.text = "0 $"
            binding.textViewSaladTime.text = "0 Min"
        }
    }

    private fun prepareLast(binding: FragmentFinishOrderBinding){
        binding.textViewTotalCost.text = "Cost : $totalCost $ Time : $time Min"
        binding.progressBar.max = time
        binding.progressBar.progress = 0
    }

    private fun startCountdown(binding: FragmentFinishOrderBinding) {
        while(time > 0){
            time--
            binding.progressBar.progress++
            SystemClock.sleep(500)
        }
        OrderMainFragment.lastType = 0
        OrderMainFragment.beverage = 0
        OrderMainFragment.dessert = 0
        OrderMainFragment.mainDish = 0
        OrderMainFragment.salad = 0
        OrderMainFragment.warmup = 0
        OrderMainFragment.sMain = ""
        OrderMainFragment.sDessert = ""
        OrderMainFragment.sBeverage = ""

        findNavController().navigate(FinishOrderFragmentDirections.actionFinishOrderFragmentToMainFragment())

    }
}