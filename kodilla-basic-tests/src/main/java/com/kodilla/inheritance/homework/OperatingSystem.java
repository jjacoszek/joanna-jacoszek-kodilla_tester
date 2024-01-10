package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int publicationDate;
    public OperatingSystem(int publicationDate){
        this.publicationDate = publicationDate;
    }

    public void turnOn(){
        System.out.println("It is turned on");
    }

    public void turnOff(){
        System.out.println("It is turned off");
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void showPublicationDate(){
        System.out.println("Publication date is " + publicationDate);

    }
}
