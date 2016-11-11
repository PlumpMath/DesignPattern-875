package com.design.StructuralDesignPattern.DecoratorPattern.FlyweightPattern;

/**
 * Instance of Item will be Flyweight
 * Created by sahilk on 11/11/16.
 */
public class Item {

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
