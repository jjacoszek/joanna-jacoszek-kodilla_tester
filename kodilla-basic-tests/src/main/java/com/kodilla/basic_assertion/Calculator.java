package com.kodilla.basic_assertion;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;

    }

    int sumDisplay(){
        int x = a + b;
        return x;
    }

    int substractionDisplay(){
        int y = b - a;
        return y;
    }

    int squaring(){
        int z = a * a;
        return z;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}

class App{

    public static void main(String[] args) {

        Calculator calculator = new Calculator(4, 25);
        System.out.println(calculator.sumDisplay());
        System.out.println(calculator.substractionDisplay());
        System.out.println(calculator.squaring());

        int sumResult = calculator.sumDisplay();
        boolean correct = ResultChecker.assertEquals(29, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + calculator.getA() + " i " + calculator.getB());
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + calculator.getA() + " i " + calculator.getB());
        }


        int substractionResult = calculator.substractionDisplay();
        boolean correct1 = ResultChecker.assertEquals(21, substractionResult);
        if (correct1) {
            System.out.println("Metoda odejmowania działa poprawnie dla liczb " + calculator.getA() + " i " + calculator.getB());
        } else {
            System.out.println("Metoda odejmowania nie działa poprawnie dla liczb " + calculator.getA() + " i " + calculator.getB());
        }

        int squaringResult = calculator.squaring();
        boolean correct2 = ResultChecker.assertEquals(16, squaringResult);
        if (correct2) {
            System.out.println("Metoda potęgowania działa poprawnie dla liczby " + calculator.getA());
        } else {
            System.out.println("Metoda nie działa poprawnie dla liczb " + calculator.getA());
        }
    }
}