package com.bbm.foodservice.dishes.Warmups;

public class Mercimek extends Warmups{
    public Mercimek(){
        super.setName("Mercimek Corbasi");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Kırmızı mercimek");
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
