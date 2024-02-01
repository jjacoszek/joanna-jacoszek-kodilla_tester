package com.kodilla.optional.homework;

public class Student {

    private String Name;
    private Teacher teacher;

    public Student(String name, Teacher teacher) {
        Name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return Name;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
