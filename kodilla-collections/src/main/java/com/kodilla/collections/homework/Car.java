package com.kodilla.collections.homework;


import java.util.Random;

class Car {
    private String brand;
    private int speed;

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }
}

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("Car brand: " + car.getBrand() + ", speed: " + car.getSpeed() + " km/h");
    }
}

class CarsApplication {
    public static Car drawCar() {
        Random random = new Random();
        String[] brands = {"Toyota", "Ford", "Chevrolet", "Honda", "BMW"};
        String randomBrand = brands[random.nextInt(brands.length)];
        int randomSpeed = random.nextInt(100) + 1; // Speed between 1 and 100 km/h
        return new Car(randomBrand, randomSpeed);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = random.nextInt(15) + 1; // Array size between 1 and 15
        Car[] cars = new Car[arraySize];

        for (int i = 0; i < arraySize; i++) {
            cars[i] = drawCar();
        }

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}