package com.kodilla.abstracts.homework;

class Person {

    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Job getJob() {
        return job;

    }

    @Override
    public String toString() {
        return "Person: "  + firstName + " " + "and age: "  +  age + " " + " and salary: "
                + job.getSalary() + " " +  " and responsibility: "+  job.getResponsibilities();

    }
}
