package com.bbm.foodservice.dishes.Desserts.Serbetli;

public class Revani extends Serbetli{
    public Revani(){
        super.setName("Revani");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Irmik");
        super.setIngredients("Yumurta");
        super.setIngredients("Limon suyu");
        super.setIngredients("Serbet");
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
