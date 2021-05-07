package com.bbm.foodservice.dishes.Desserts.Sutlu;

public class Gullac extends Sutlu{
    public Gullac(){
        super.setName("Gullac");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Gullac hamuru");
        super.setIngredients("Sut");
        super.setIngredients("Seker");
        super.setIngredients("Ceviz");
    }

    @Override
    public void cookTime() {
        super.setTime(20);
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
