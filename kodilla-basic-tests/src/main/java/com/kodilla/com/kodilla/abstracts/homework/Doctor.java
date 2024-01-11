package com.kodilla.com.kodilla.abstracts.homework;

public class Doctor extends Job {



    @Override
    int getSalary() {
        return 5500;
    }

    @Override
    String getResponsibilities() {
        String s = "He carries out the medical examinations";
        return s;
    }
}
