package com.jasond;

public class RunAnimalClass {

    public static void main(String[] args) {

        System.out.println("Testing Bird Class");
        Animal myBird = new Bird();

        myBird.label();
        myBird.move();
        myBird.eat();

        System.out.println("\nTesting Fish Class");
        Animal myFish = new Fish();

        myFish.label();
        myFish.move();
        myFish.eat();




    }

    }



