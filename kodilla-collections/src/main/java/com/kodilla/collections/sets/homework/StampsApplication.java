package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Warszawa",32, 43));
        stamps.add(new Stamp("Krakow",37, 44));
        stamps.add(new Stamp("Poznan",31, 45));
        stamps.add(new Stamp("Warszawa",32, 43));
        stamps.add(new Stamp("Poznan",31, 45));


        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
