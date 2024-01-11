package com.kodilla.com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double surfaceArea() {
        //a+b = pole powierzchni
        double x;
        x = getA() * getB();
        return x;
    }

    @Override
    double circumference() {
        // 2*a + 2*b = obwod
        double y;
        y = 2*getA() + 2*getB();
        return y;
    }
}



