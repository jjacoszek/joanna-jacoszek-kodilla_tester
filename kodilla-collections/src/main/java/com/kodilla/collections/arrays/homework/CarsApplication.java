package com.kodilla.collections.arrays.homework;

import homework.BMW;
import homework.Car;
import homework.Mercedes;
import homework.Toyota;

import java.util.Random;

public class CarsApplication {

    public static Car drawCar() {
        Random random = new Random();
        int car = random.nextInt(3);
        int speedValue = random.nextInt(100);
        if (car == 0)
            return new BMW(speedValue);
        else if (car == 1)
            return new Mercedes(speedValue);
        else
            return new Toyota(speedValue);

    }

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
