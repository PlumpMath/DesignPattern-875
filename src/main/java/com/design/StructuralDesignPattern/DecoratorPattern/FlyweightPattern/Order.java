package com.design.StructuralDesignPattern.DecoratorPattern.FlyweightPattern;

/**
 * Created by sahilk on 11/11/16.
 */
public class Order {

    private final int orderNumber;
    private final Item item;

    public Order(Item item, int orderNumber) {
        this.item = item;
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "item=" + item +
                ", orderNumber=" + orderNumber +
                '}';
    }


    public void processOrder(){
        System.out.println(String.format("Ordering %s for the order number %s",item.getName(),orderNumber));
    }
}
