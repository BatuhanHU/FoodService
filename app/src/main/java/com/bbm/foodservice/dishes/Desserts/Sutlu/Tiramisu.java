package com.bbm.foodservice.dishes.Desserts.Sutlu;

public class Tiramisu extends Sutlu{
    public Tiramisu(){
        super.setName("Tiramisu");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Labne");
        super.setIngredients("Kahve");
        super.setIngredients("Süt");
        super.setIngredients("Seker");
    }

    @Override
    public void cookTime() {
        super.setTime(25);
    }

    @Override
    public void calculateCost() {
        super.setCost(15);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }
}
