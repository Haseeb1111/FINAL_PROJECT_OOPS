package com.company;

public class Context{
    private FoodFacility foodFacility;

    public Context(FoodFacility foodFacility){
        this.foodFacility = foodFacility;
    }

    public void addFoodFacility(){
        foodFacility.addFoodFacility();
    }
}
