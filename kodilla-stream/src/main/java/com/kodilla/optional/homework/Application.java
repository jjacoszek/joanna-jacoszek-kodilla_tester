package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Profesor Zdrówko");
        Teacher teacher1 = new Teacher("Profeosr Prawa");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jacek",teacher));
        students.add(new Student("Franek",teacher1));
        students.add(new Student("Jacek",null));
        students.add(new Student("Jacek",null));




            for(Student student: students){
                String studentName = student.getName();
                String teacherName = Optional.ofNullable(student.getTeacher())
                        .map(Teacher::getName)
                        .orElse("<undefined>");
                System.out.println("Uczeń: " + studentName + ", Nauczyciel: " + teacherName);

            }

    }
}
