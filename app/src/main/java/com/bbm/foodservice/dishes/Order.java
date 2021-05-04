package com.bbm.foodservice.dishes;

import com.bbm.foodservice.dishes.Beverages.Beverages;
import com.bbm.foodservice.dishes.Desserts.Desserts;
import com.bbm.foodservice.dishes.MainDish.MainDish;
import com.bbm.foodservice.dishes.Salads.Salads;
import com.bbm.foodservice.dishes.Warmups.Warmups;

public class Order {

    MainDish maindish;
    Warmups warmup;
    Salads salad;
    Desserts dessert;
    Beverages beverage;

    public void prepareOrder(String mainDishType, String type, String warmups,String saladType,String dessertType, String desserts,String beverageType,String drink){
        maindish = MainDish.chooseDish(mainDishType, type);
        maindish.prepareFood();
        warmup = Warmups.chooseDish(warmups);
        warmup.prepareFood();
        salad = Salads.chooseDish(saladType);
        salad.prepareFood();
        dessert = Desserts.chooseDish(dessertType,desserts);
        dessert.prepareFood();
        beverage = Beverages.chooseDish(beverageType,drink);
        beverage.prepareFood();
    }

    public static void main(String[] args){
        Order order = new Order();
        order.prepareOrder("kebab","adana","yayla","saezar","sutlu","tiramisu","hot","tea");
        System.out.println(order.maindish.getName());
        System.out.println(order.maindish.getIngredients());
    }

}
