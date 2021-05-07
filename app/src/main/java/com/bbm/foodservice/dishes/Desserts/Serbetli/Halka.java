package com.bbm.foodservice.dishes.Desserts.Serbetli;

public class Halka extends Serbetli{
    public Halka(){
        super.setName("Halka tatli");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Serbet");
        super.setIngredients("Hamur");
        super.setIngredients("Limon tuzu");
        super.setIngredients("Sıvı yag");
    }

    @Override
    public void cookTime() {
        super.setTime(15);
    }

    @Override
    public void calculateCost() {
        super.setCost(5);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }
}
