package com.kodilla.basic_assertion;

public class Calculator {

    private double a;
    private double b;

    Calculator(double a, double b){
        this.a = a;
        this.b = b;

    }

    double sumDisplay(){
        double x = a + b;
        return x;
    }

    double substractionDisplay(){
        double y = b - a;
        return y;
    }

    double squaring(){
        double z = a * a;
        return z;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}

class App{

    public static void main(String[] args) {

        Calculator calculator = new Calculator(4.00, 25.00);
        System.out.println(calculator.sumDisplay());
        System.out.println(calculator.substractionDisplay());
        System.out.println(calculator.squaring());

       double sumResult = calculator.sumDisplay();
        boolean correct = ResultChecker.assertEquals(29, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + calculator.getA() + " i " + calculator.getB());
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + calculator.getA() + " i " + calculator.getB());
        }


       double substractionResult = calculator.substractionDisplay();
        boolean correct1 = ResultChecker.assertEquals(21, substractionResult);
        if (correct1) {
            System.out.println("Metoda odejmowania działa poprawnie dla liczb " + calculator.getA() + " i " + calculator.getB());
        } else {
            System.out.println("Metoda odejmowania nie działa poprawnie dla liczb " + calculator.getA() + " i " + calculator.getB());
        }

        double squaringResult = calculator.squaring();
        boolean correct2 = ResultChecker.assertEquals(16, squaringResult);
        if (correct2) {
            System.out.println("Metoda potęgowania działa poprawnie dla liczby " + calculator.getA());
        } else {
            System.out.println("Metoda nie działa poprawnie dla liczb " + calculator.getA());
        }
    }
}