package com.design.CreationalDesignPattern.FactoryPattern;

/**
 * Created by sahilk on 05/11/16.
 */
public class TestFactoryPattern {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException {

        AutoFactory autoFactory = new AutoFactory();
        String carName = "Audi";
        Cars cars = autoFactory.getAutoCarInstance(carName);
        if(cars != null) {
            cars.start();
            cars.stop();
        }else{
            System.out.println("No car found by given name [" + carName +"].");
        }


    }
}
