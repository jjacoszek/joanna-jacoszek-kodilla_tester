package com.kodilla.inheritance.homework;

public class Android extends OperatingSystem {

public Android(int publicationDate){
    super(publicationDate);
    System.out.println("Android constructor");
}

    @Override
    public void turnOn(){
        System.out.println("It is turned on in winter season");
    }

    @Override
    public void turnOff(){
    System.out.println("It is turned off in winter season");
}


}
