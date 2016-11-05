package com.design.FactoryPattern;

/**
 * Created by sahilk on 05/11/16.
 */
public class BMWCar implements Cars {
    public void start() {
        System.out.println("BMW has been started");
    }

    public void stop() {
        System.out.println("BMW has been stoped");
    }
}
