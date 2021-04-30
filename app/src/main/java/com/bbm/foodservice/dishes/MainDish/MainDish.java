package com.bbm.foodservice.dishes.MainDish;

import com.bbm.foodservice.dishes.Order;

import java.util.Date;
import java.util.concurrent.TimeUnit;

abstract class MainDish extends Order {

    private String name;
    public abstract void addIngredients();

}
