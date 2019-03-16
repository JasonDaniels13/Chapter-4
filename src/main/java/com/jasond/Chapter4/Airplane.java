package com.jasond.Chapter4;

public class Airplane extends Vehicle {



    //polymorphism
    public void wiper() {
        System.out.println("Airplane turining wipers activated");
    }

    //abstraction
    @Override
    public void lights() {
        System.out.println("Airplane lights going on.");

    }
}