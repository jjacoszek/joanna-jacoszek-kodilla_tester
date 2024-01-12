package com.kodilla.abstracts.homework;

public abstract class Shape {

    private double a;
    private double b;


    public Shape (double a, double b){
        this.a = a;
        this.b = b;


    }

    abstract double surfaceArea();

    abstract double circumference();

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
