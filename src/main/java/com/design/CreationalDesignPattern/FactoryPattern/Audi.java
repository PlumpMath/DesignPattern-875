package com.design.CreationalDesignPattern.FactoryPattern;

/**
 * Created by sahilk on 06/11/16.
 */
public class Audi implements Cars {
    public void start() {
        System.out.println("Audi has been started");
    }

    public void stop() {
        System.out.println("Audi has been stoped");
    }
}
