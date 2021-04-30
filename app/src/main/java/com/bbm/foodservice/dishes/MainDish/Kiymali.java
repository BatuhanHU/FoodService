package com.bbm.foodservice.dishes.MainDish;

import java.util.ArrayList;

public class Kiymali extends Pide{
    private ArrayList<String> ingredients= new ArrayList<String>();
    private int cost;
    public Kiymali(){
        this.cost=9;
        addIngredients();
    }

    @Override
    public void addCost(){
        super.addCost(this.cost);
    }

    public void addIngredients(){
        super.addIngredients("Kiyma");
    }

}
