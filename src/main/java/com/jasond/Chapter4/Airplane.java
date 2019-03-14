package com.jasond.Chapter4;

public class Airplane extends Vehicle {



    //polymorphism
    @Override
    public void hooter() {
        System.out.println("Airplane hooting: Swooosh");
    }
    public void wiper() {
        System.out.println("Airplane turining wipers on");
    }
}
