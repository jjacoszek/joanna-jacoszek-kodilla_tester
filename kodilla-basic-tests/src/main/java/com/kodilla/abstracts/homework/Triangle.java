package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

private double c;
    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    @Override
    double surfaceArea() {
        //a*b/2--> pole trojkata
        double x;
        x = getA()*getB()/2;
        return c;
    }

    @Override
    double circumference() {
        // a+b+c --> obwod trojkata
        double y;
        y = getA() + getB() + c;
        return y;
    }
}
