package com.kodilla.collections.adv.exercises.dictionary.com.kodilla.collections.adv.exercises;

public class Flight {
    private String departure;
    private String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }
}
