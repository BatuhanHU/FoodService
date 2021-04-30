package com.bbm.foodservice.dishes;

public abstract class Order {


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void addCost(int cost){
        this.cost+=cost;
    }

    private int cost;

    public abstract void addCost();

}
