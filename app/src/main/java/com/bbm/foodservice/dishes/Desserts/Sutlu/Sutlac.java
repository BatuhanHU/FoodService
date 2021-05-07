package com.bbm.foodservice.dishes.Desserts.Sutlu;

public class Sutlac extends Sutlu{
    public Sutlac(){
        super.setName("Sutlac");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Pirinc");
        super.setIngredients("Sut");
        super.setIngredients("Seker");
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
