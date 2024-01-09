package com.kodilla.inheritance;

public class Convertible extends Car {

    public void openRoof() {
        System.out.println("Opening roof...");
    }

    public void closeRoof() {
        System.out.println("Closing roof...");
    }


    }
 public class
 Application {
     public static void main(String[] args) {

         Car car = new Car();
         car.turnOnLights();

         Convertible convertible = new Convertible();
         convertible.closeRoof();


     }

 }