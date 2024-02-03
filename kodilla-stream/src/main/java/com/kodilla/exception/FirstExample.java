package com.kodilla.exception;

public class FirstExample {
    public static void main(String[] args) {
        String username = "Willy Wonka";
        String[] nameParts  = username.split("");
        System.out.println("First Name: " + nameParts[0]);
        System.out.println("Last Name: " + nameParts[1]);
    }
}
