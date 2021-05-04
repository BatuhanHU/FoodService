package com.bbm.foodservice.dishes.MainDish.Izgara;

public class TavukKanat extends Izgara{

    public TavukKanat(){
        super.setName("Izgara tavuk kanat");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Tavuk kanat");
    }

    @Override
    public void cookTime() {
        super.setTime(30);
    }

    @Override
    public void calculateCost() {
        super.setCost(30);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }
}
