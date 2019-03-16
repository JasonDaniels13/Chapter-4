package com.jasond.Chapter4;

public class MainClass {

    public static void main(String[] args) {

        Vehicle car = new BMW();
        Vehicle airplane = new Airplane();
        Vehicle motorbike = new Motorcycle();

        Weather weather = new Weather();


        //encapsulation
        airplane.setColour("White");
        System.out.println("The Aircraft is "+ airplane.getColour()+ " in colour");

        //inheriting the lights methods from Vehicle class
        car.lights();

        //polymorphism
        weather.rain(motorbike);



    }
}