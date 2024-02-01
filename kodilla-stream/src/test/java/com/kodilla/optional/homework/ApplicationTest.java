package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ApplicationTest {
    @Test
    public void testStudentTeacherPairs() {
        // Arrange
        Teacher teacher = new Teacher("Profesor Zdrówko");
        Teacher teacher1 = new Teacher("Profeosr Prawa");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jacek", teacher));
        students.add(new Student("Franek", teacher1));
        students.add(new Student("Marek", null));
        students.add(new Student("Anna", null));

        // Act
        List<String> studentTeacherPairs = new ArrayList<>();
        for (Student student : students) {
            String studentName = student.getName();
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            studentTeacherPairs.add("Uczeń: " + studentName + ", Nauczyciel: " + teacherName);
        }

        // Assert
        assertEquals("Uczeń: Jacek, Nauczyciel: Profesor Zdrówko", studentTeacherPairs.get(0));
        assertEquals("Uczeń: Franek, Nauczyciel: Profeosr Prawa", studentTeacherPairs.get(1));
        assertEquals("Uczeń: Marek, Nauczyciel: <undefined>", studentTeacherPairs.get(2));
        assertEquals("Uczeń: Anna, Nauczyciel: <undefined>", studentTeacherPairs.get(3));
    }

    @Test
    public void testNullTeacher() {
        // Arrange
        Student student = new Student("John", null);

        // Act
        String teacherName = Optional.ofNullable(student.getTeacher())
                .map(Teacher::getName)
                .orElse(null);

        // Assert
        assertNull(teacherName);
    }

}
