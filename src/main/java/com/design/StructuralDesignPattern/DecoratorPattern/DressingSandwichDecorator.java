package com.design.StructuralDesignPattern.DecoratorPattern;

/**
 * Created by sahilk on 10/11/16.
 */
public class DressingSandwichDecorator extends SandwichDecorator {
    public DressingSandwichDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    public String make(){
        return sandwich.make() + addDressing();
    }

    private String addDressing() {
        return " with dressing ";
    }
}
