package com.design.CreationalDesignPattern.BuilderPattern;
/**
 * Created by sahilk on 04/11/16.
 */
public abstract class SandwichBuilder {

    public Sandwich sandwich;
    public abstract void applyBread();
    public abstract void applyVegetables();
    public abstract void addMeatAndCheese();


    public Sandwich getSandwich(){
        return this.sandwich;
    }

    public void createNewSandwich(){
        sandwich = new Sandwich();
    }
}
