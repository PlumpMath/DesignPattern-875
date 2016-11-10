package com.design.StructuralDesignPattern;

/**
 * Created by sahilk on 10/11/16.
 */
public abstract  class SandwichDecorator implements Sandwich{

    protected Sandwich sandwich;
    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public String make(){
        return sandwich.make();
    }

}
