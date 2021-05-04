package com.bbm.foodservice.dishes.Beverages.Hot;

import com.bbm.foodservice.dishes.Beverages.Beverages;

abstract public class Hot extends Beverages {
    public static Hot returnDish(String type){
        if(type.equalsIgnoreCase("coffee")){
            return new Coffee();
        }else if(type.equalsIgnoreCase("tea")){
            return new Tea();
        }
        return null;
    }
}
