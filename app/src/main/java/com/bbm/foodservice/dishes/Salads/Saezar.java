package com.bbm.foodservice.dishes.Salads;

public class Saezar extends Salads{
    public Saezar(){
        super.setName("Saezar Salad");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Domates");
        super.setIngredients("Marul");
        super.setIngredients("Ekmek");
        super.setIngredients("Limon");
        super.setIngredients("Parmesan");
        super.setIngredients("Hardal");
        super.setIngredients("Mayonez");
    }

    @Override
    public void cookTime() {
        super.setTime(10);
    }

    @Override
    public void calculateCost() {
        super.setCost(16);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }

}
