package com.kodilla.com.kodilla.abstracts.homework;

public class APPLICATION10 {

    public static void main(String[] args) {

        Person person = new Person("Jack", 42, new Doctor());
        Person person1 = new Person("Katherine", 24, new Driver());


        System.out.println(person);
        System.out.println(person1);
    }



}
