package com.jasond.Chapter4;

public class MainClass {

    public static void main(String[] args) {

        Vehicle car = new BMW();
        Vehicle airplane = new Airplane();
        Weather weather = new Weather();


        car.hooter();
        airplane.hooter();

        //inheriting the lights methods from Vehicle class
        car.lights();

        //polymorphism
        weather.rain(car);



    }
}
