package com.bbm.foodservice.dishes.Warmups;

public class Tarhana extends Warmups{
    public Tarhana(){
        super.setName("Tarhana Corbasi");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Tarhana");
        super.setIngredients("Soğan");
        super.setIngredients("Patates");
    }

    @Override
    public void cookTime() {
        super.setTime(15);
    }

    @Override
    public void calculateCost() {
        super.setCost(11);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }
}
