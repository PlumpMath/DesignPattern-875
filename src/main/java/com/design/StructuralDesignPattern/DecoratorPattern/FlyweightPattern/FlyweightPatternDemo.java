package com.design.StructuralDesignPattern.DecoratorPattern.FlyweightPattern;

/**
 * Created by sahilk on 11/11/16.
 */
public class FlyweightPatternDemo {


    /**
     * About fly weight
     * Great memory management
     * Used alot in core API (String,valueOf() for wrapper class)
     * All the places where the object creation can be expensive like (Inventory ,e-commerce,shopping kart)
     * Uses factory design pattern for object creation
     * It is the pattern which uses another pattern(factory) for it creation like factory pattern
     * @param args
     */
    public static void main(String[] args) {

        InventorySystem inventorySystem = new InventorySystem();
        inventorySystem.takeOrder("boss headphones",230);
        inventorySystem.takeOrder("skullcandy headphones",231);
        inventorySystem.takeOrder("JBL headphones",232);
        inventorySystem.takeOrder("sony headphones",233);
        inventorySystem.takeOrder("boss headphones",234);

        inventorySystem.processOrder();
        System.out.println(inventorySystem.report());

    }
}
