package com.bbm.foodservice.dishes.MainDish.Pide;

import java.util.ArrayList;

public class Kiymali extends Pide {
    public Kiymali(){
        super.setName("Kiymali pide");
    }

    @Override
    public void addIngredients(){
        super.setIngredients("Kiyma");
    }

    @Override
    public void cookTime() {
        super.setTime(35);
    }

    @Override
    public void calculateCost() {
        super.setCost(40);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }

}
