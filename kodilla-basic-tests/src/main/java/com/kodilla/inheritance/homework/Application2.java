package com.kodilla.inheritance.homework;

public class Application2 {
    public static void main(String[] args) {

        OperatingSystem operatingSystem = new OperatingSystem(2018);
        operatingSystem.showPublicationDate();
        operatingSystem.turnOn();
        operatingSystem.turnOff();


        Android android = new Android(2015);
        android.showPublicationDate();
        android.turnOn();
        android.turnOff();

        iOS ios = new iOS(2023);
        ios.showPublicationDate();
        ios.turnOn();
        ios.turnOff();

    }
}