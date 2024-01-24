package com.kodilla.collections.adv.maps.com.kodilla.collections.adv.maps.homework;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Principal principal1 = new Principal("JAN KOWALSKI");
        Principal principal2 = new Principal("KAZIMIERZ DOLNY");

        ArrayList<Integer> school1Classes = new ArrayList<>();
        school1Classes.add(24);
        school1Classes.add(28);
        School school1 = new School("PRIMARY SCHOOL", school1Classes);

        ArrayList<Integer> school2Classes = new ArrayList<>();
        school2Classes.add(32);
        school2Classes.add(35);
        School school2 = new School("HIGH School", school2Classes);

        Map<Principal, School> schoolMap = new HashMap<>();
        schoolMap.put(principal1, school1);
        schoolMap.put(principal2, school2);


        for (Map.Entry<Principal, School> entry : schoolMap.entrySet()) {
            Principal principal = entry.getKey();
            School school = entry.getValue();

            System.out.println("Principal: " + principal.getPrincipalName());
            System.out.println("School: " + school.getName());
            System.out.println("Total Students: " + school.getTotalStudents());
            System.out.println("---------------");
        }
    }

    }

