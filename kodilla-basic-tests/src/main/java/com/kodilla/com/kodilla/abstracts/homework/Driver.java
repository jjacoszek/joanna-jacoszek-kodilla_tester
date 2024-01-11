package com.kodilla.com.kodilla.abstracts.homework;

public class Driver extends Job{




    @Override
    int getSalary() {
        return 5200;
    }

    @Override
    String getResponsibilities() {
        String z = "He takes stuff from one place and transit to another one";
        return z;
    }
}
