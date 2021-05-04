package com.bbm.foodservice.dishes.Warmups;

public class EzoGelin extends Warmups{
    public EzoGelin(){
        super.setName("EzoGelin Corbasi");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Kırmızı mercimek");
        super.setIngredients("Pirinc");
        super.setIngredients("Bulgur");
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
