package com.bbm.foodservice.dishes.Warmups;

public class KellePaca extends Warmups{
    public KellePaca(){
        super.setName("KellePaca Corbasi");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Kelle paca");
    }

    @Override
    public void cookTime() {
        super.setTime(20);
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
