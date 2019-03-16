package com.jasond.Chapter4;

public class BMW extends Vehicle {


    @Override
    public void hooter() {
        System.out.println("BMW hooting: Barb barb");

    }
    public void wiper() {
        System.out.println("BMW turining wipers activated.");
    }


    @Override
    public void lights() {
        System.out.println("BMW Xenon lights are on.");

    }
}