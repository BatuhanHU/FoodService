package com.bbm.foodservice.dishes.Beverages;

import com.bbm.foodservice.dishes.Beverages.Hot.Hot;
import com.bbm.foodservice.dishes.Beverages.Normal.Normal;
import com.bbm.foodservice.dishes.Beverages.Sparkling.Sparkling;
import com.bbm.foodservice.dishes.Order;
import java.util.ArrayList;

abstract public class Beverages extends Order{
    private String name;
    private int time;
    private double cost;
    private boolean preparing;
    private ArrayList<String> ingredients = new ArrayList<>();

    public static Beverages chooseDish(String beverageType, String drink){
        if(beverageType.equalsIgnoreCase("hot")){
            return Hot.returnDish(drink);
        }else if(beverageType.equalsIgnoreCase("normal")){
            return Normal.returnDish(drink);
        }else if(beverageType.equalsIgnoreCase("sparkling")){
            return Sparkling.returnDish(drink);
        }
        return null;
    }

    //steps
    /*
    public abstract void addIngredients();
    public abstract void cookTime();
    public abstract void calculateCost();
    public abstract void prepareToServe();
*/
    public abstract void prepareBeverages();
    //template method
    public void prepareFood(){

        /*
        addIngredients();
        cookTime();
        calculateCost();
        prepareToServe();
         */
        prepareBeverages();
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public boolean getPreparing() {
        return preparing;
    }

    public void setPreparing(boolean preparing) {
        this.preparing = preparing;
    }

}
