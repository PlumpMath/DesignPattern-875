package com.design.StructuralDesignPattern;

/**
 * Created by sahilk on 10/11/16.
 */
public class MeatSandwichDecorator extends SandwichDecorator {

    public MeatSandwichDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    public String make() {
        return sandwich.make() + addName();

    }

    private String addName(){
        return "and Turkey added";
    }
}
