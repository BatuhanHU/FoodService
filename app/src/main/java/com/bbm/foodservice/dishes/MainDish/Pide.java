package com.bbm.foodservice.dishes.MainDish;


import java.util.ArrayList;

abstract public class Pide extends MainDish {
    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredients(String i) {
        this.ingredients.add(i);
    }


    private ArrayList<String> ingredients= new ArrayList<String>();
    public abstract void addIngredients();
    public Pide(){}
}
