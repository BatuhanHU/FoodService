package com.bbm.foodservice.dishes.MainDish;

import java.util.ArrayList;

public class Kasarli extends Pide {

    private int cost;
    public Kasarli(){
        this.cost = 10;
    }

    @Override
    public void addCost(){
        super.addCost(this.cost);
    }

    public void addIngredients(){
        super.addIngredients("Kasar");
        super.addIngredients("Kiyma");
    }
}
