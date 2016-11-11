package com.design.StructuralDesignPattern.DecoratorPattern.FlyweightPattern;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * This is concreate factory for the catalog where all items and orders are stored
 * Created by sahilk on 11/11/16.
 */
public class InventorySystem {

    private final Catalog catalog = new Catalog();
    private final List<Order> orderList = new CopyOnWriteArrayList<Order>();

    public void takeOrder(String itemName, int orderNumber){
        Item item = catalog.lookup(itemName);
        Order order = new Order(item, orderNumber);
        orderList.add(order);
    }

    void processOrder(){
        for(Order order: orderList){
            order.processOrder();
            orderList.remove(order);
        }
    }

     public String report(){
        return "The total number of record processed are -: " + catalog.totalItemSize();
    }
}
