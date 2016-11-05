package com.design.CreationalDesignPattern.FactoryPattern;
/**
 * Created by sahilk on 05/11/16.
 */
public class Mercedes implements Cars{
    public void start() {
        System.out.println("Mercedes has been started");
    }

    public void stop() {
        System.out.println("Mercedes has been stoped");
    }
}
