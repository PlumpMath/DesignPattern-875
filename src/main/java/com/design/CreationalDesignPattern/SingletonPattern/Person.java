package com.design.CreationalDesignPattern.SingletonPattern;

/**
 * Created by sahilk on 06/11/16.
 */
public class Person {

    // Always pull value from head not from thread stack
    private static volatile Person person;

    private Person(){
    }
    // Double check locking
    public static Person getInstance(){
        if (person == null) {
            synchronized (Person.class) {
                if (person == null) {
                    person = new Person();
                    return person;
                }
            }
        }
        return person;
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
        System.out.println(getInstance());
    }
}
