package com.kodilla.collections.lists.homework;


import com.kodilla.collections.homework.CarUtils;
import com.kodilla.inheritance.Car;
import homework.BMW;
import homework.Mercedes;
import homework.Toyota;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {


    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Mercedes(180));
        cars.add(new BMW(123));
        cars.add(new Toyota(80));
        Mercedes mercedes1 = new Mercedes(190);
        cars.add(mercedes1);

        cars.remove(1);
        cars.remove(mercedes1);
        System.out.println("the list size is " + cars.size());

        for (Car car : cars){
            CarUtils.describeCar(car);
        }
    }
}
