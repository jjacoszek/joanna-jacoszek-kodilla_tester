package com.kodilla.abstracts.homework;

public class App {

    public static void main(String[] args) {
        Shape triangle = new Triangle(10,5,7);
        System.out.println("The circumference of triangle is " + triangle.circumference() );
        System.out.println("The surface area of triangle is " + triangle.surfaceArea());

        Shape rectangle = new Rectangle(34.5, 15);
        System.out.println("Surface area for rectangle is " + rectangle.surfaceArea());
        System.out.println("Circumference for rectangle is " + rectangle.circumference());

        Shape square = new Square(22.5, 0);
        System.out.println("The surface area of square is " + square.surfaceArea());
        System.out.println("The circumference of square is " + square.circumference());
    }

}
