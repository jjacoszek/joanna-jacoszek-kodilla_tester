package com.kodilla.collections.adv.maps.com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;

public class School {
    private String name;
    private ArrayList<Integer> studentsPerClass;

    public School(String name, ArrayList<Integer> studentsPerClass) {
        this.name = name;
        this.studentsPerClass = studentsPerClass;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getStudentsPerClass() {
        return studentsPerClass;
    }

    public int getTotalStudents() {
        int total = 0;
        for (int students : studentsPerClass) {
            total += students;
        }
        return total;
    }
}