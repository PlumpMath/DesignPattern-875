package com.design.StructuralDesignPattern;

/**
 * Created by sahilk on 10/11/16.
 */
public class MainClass {

    public static void main(String[] args) {
        Sandwich basicSandwich = new SimpleSandwich();
        Sandwich sandwich = new MeatSandwichDecorator(new DressingSandwichDecorator(basicSandwich));
        System.out.println(sandwich.make());
    }

}
