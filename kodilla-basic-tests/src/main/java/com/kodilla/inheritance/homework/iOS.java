package com.kodilla.inheritance.homework;

public class iOS extends OperatingSystem{

    public iOS(int publicationDate){
        super(publicationDate);
        System.out.println("iOS Constructor");
    }

    @Override
    public void turnOn(){
        System.out.println("It is turned on when is needed");
    }
    @Override
    public void turnOff(){
        System.out.println("It is turned off from time to time");
    }

}
