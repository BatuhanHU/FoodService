package com.bbm.foodservice.dishes.MainDish.Sisler;

import java.util.ArrayList;

public class Cop extends Sis{

    public Cop(){
        super.setName("cop sis");
    }

    @Override
    public void addIngredients(){
        super.setIngredients("Bonfile");
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
