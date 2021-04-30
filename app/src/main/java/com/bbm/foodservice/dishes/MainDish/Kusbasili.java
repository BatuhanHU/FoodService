package com.bbm.foodservice.dishes.MainDish;

import java.util.ArrayList;

public class Kusbasili extends Pide {

    private ArrayList<String> ingredients= new ArrayList<String>();
    private int cost;

    public void Kusbasili(){
        this.cost=13;
    }

    @Override
    public void addCost(){
        super.addCost(this.cost);
    }


    @Override
    public void addIngredients(){
        super.addIngredients("Kusbasi");
        super.addIngredients("Tomato");
    }






}
