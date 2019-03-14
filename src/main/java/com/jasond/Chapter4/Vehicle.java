package com.jasond.Chapter4;

abstract public class Vehicle {

    //Encapsulation - Hiding
    private String manufacturer;
    private String colour;
    private String movement;
    private int wheels;

    public Vehicle() {
    }

    public Vehicle(String manufacturer, String colour, String movement, int wheels) {
        this.manufacturer = manufacturer;
        this.colour = colour;
        this.movement = movement;
        this.wheels = wheels;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
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
