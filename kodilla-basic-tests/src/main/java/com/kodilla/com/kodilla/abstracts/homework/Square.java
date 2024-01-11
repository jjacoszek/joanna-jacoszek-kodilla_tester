package com.kodilla.com.kodilla.abstracts.homework;

public class Square extends Shape {


    public Square(double a, double b) {
        super(a, b);
    }

    @Override
    double surfaceArea() {
        //a*a = pole powierzchni
        double x = getA() *getA();
        return x;
    }

    @Override
    double circumference() {
        // 4*a = obwod
        double y = 4* getA();
        return y;
    }
}

