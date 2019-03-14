package com.jasond.Chapter4;

public class Motorcycle extends Vehicle {


    public Motorcycle() {

    }

    //polymorphism
    @Override
    public void hooter() {
        System.out.println("Motorcycle hooting: Beep Beep");

    }
    public void wiper() {
        System.out.println("Motorcycle turining wiper on");
    }


}
