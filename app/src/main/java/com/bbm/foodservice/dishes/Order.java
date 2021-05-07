package com.bbm.foodservice.dishes;

import com.bbm.foodservice.dishes.Beverages.Beverages;
import com.bbm.foodservice.dishes.Desserts.Desserts;
import com.bbm.foodservice.dishes.MainDish.MainDish;
import com.bbm.foodservice.dishes.Salads.Salads;
import com.bbm.foodservice.dishes.Warmups.Warmups;

public class Order {

    public MainDish maindish;
    public Warmups warmup;
    public Salads salad;
    public Desserts dessert;
    public Beverages beverage;

    public void prepareOrder(String mainDishType, String type, String warmups,String saladType,String dessertType, String desserts,String beverageType,String drink){
        maindish = MainDish.chooseDish(mainDishType, type);
        if (maindish != null) {
            maindish.prepareFood();
        }
        warmup = Warmups.chooseDish(warmups);
        if (warmup != null) {
            warmup.prepareFood();
        }
        salad = Salads.chooseDish(saladType);
        if (salad != null) {
            salad.prepareFood();
        }
        dessert = Desserts.chooseDish(dessertType,desserts);
        if (dessert != null) {
            dessert.prepareFood();
        }
        beverage = Beverages.chooseDish(beverageType,drink);
        if (beverage != null) {
            beverage.prepareFood();
        }
    }

    public static void main(String[] args){
        Order order = new Order();
        order.prepareOrder("kebab","adana","yayla","saezar","sutlu","tiramisu","hot","tea");
        System.out.println(order.maindish.getName());
        System.out.println(order.maindish.getIngredients());
    }

    @Override
    public String toString() {
        return "Order{" +
                "maindish=" + maindish +
                ", warmup=" + warmup +
                ", salad=" + salad +
                ", dessert=" + dessert +
                ", beverage=" + beverage +
                '}';
    }
}
