package com.jasond.Chapter4;

public class Motorcycle extends Vehicle {


    public Motorcycle() {

    }

    //polymorphism
    public void wiper() {
        System.out.println("Motorcycle turining wiper activated.");
    }
    //abstraction
    @Override
    public void lights() {

    }
}