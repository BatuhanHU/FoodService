package com.bbm.foodservice.dishes.Beverages.Normal;

public class Ayran extends Normal{
    public Ayran(){
        super.setName("Ayran");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Yogurt");
        super.setIngredients("Su");
        super.setIngredients("Tuz");
    }

    @Override
    public void cookTime() {
        super.setTime(5);
    }

    @Override
    public void calculateCost() {
        super.setCost(3);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }

}
