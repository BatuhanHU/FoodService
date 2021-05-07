package com.bbm.foodservice.dishes.MainDish.Izgara;

public class Kofte extends Izgara{

    public Kofte(){
        super.setName("Izgara kofte");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Kiyma");
    }

    @Override
    public void cookTime() {
        super.setTime(35);
    }

    @Override
    public void calculateCost() {
        super.setCost(40);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }
}
