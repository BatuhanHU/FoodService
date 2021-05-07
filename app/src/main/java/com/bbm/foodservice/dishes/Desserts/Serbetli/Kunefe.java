package com.bbm.foodservice.dishes.Desserts.Serbetli;

public class Kunefe extends Serbetli{
    public Kunefe(){
        super.setName("Kunefe");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Peynir");
        super.setIngredients("Kadayıf");
        super.setIngredients("Serbet");
        super.setIngredients("Dondurma");
    }

    @Override
    public void cookTime() {
        super.setTime(25);
    }

    @Override
    public void calculateCost() {
        super.setCost(25);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }
}
