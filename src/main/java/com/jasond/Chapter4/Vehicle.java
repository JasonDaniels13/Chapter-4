package com.jasond.Chapter4;

abstract public class Vehicle {

    //Encapsulation - Hiding
    private String colour;

    public Vehicle() {
    }

    public Vehicle(String colour) {

        this.colour = colour;

    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void hooter() {
        System.out.println("Sound the vehicle makes");
    }

    //Abstract method
    public abstract void lights();

    //Polymorphism
    public void wiper() {
        System.out.println("Turning lights on");
    }
}