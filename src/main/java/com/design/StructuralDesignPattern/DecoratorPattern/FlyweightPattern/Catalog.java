package com.design.StructuralDesignPattern.DecoratorPattern.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * It acts as the factory for the Flyweight Item object
 * If it exist in lookup then same object will be thrown otherwise new object will be thrown
 * Created by sahilk on 11/11/16.
 */
public class Catalog {

    private Map<String, Item> items = new HashMap<String, Item>();

    public Item lookup(String itemName){
        if(!items.containsKey(itemName)){
            items.put(itemName, new Item(itemName));
        }
        return items.get(itemName);
    }

    public int totalItemSize(){
        return items.size();
    }

}
