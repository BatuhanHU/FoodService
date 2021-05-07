package com.bbm.foodservice.dishes.Salads;

public class Sogan extends Salads{
    public Sogan(){
        super.setName("Sogan Salad");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Limon");
        super.setIngredients("Sogan");
        super.setIngredients("Sumak");
    }

    @Override
    public void cookTime() {
        super.setTime(10);
    }

    @Override
    public void calculateCost() {
        super.setCost(13);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }
}
