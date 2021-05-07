package com.bbm.foodservice.dishes.Desserts.Serbetli;

public class Baklava extends Serbetli{
    public Baklava(){
        super.setName("Baklava");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Serbet");
        super.setIngredients("Fıstık");
        super.setIngredients("Baklava hamuru");
        super.setIngredients("Tereyag");
    }

    @Override
    public void cookTime() {
        super.setTime(25);
    }

    @Override
    public void calculateCost() {
        super.setCost(20);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }

}
