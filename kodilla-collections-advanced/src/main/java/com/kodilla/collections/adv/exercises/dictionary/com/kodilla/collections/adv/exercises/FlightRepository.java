package com.kodilla.collections.adv.exercises.dictionary.com.kodilla.collections.adv.exercises;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {


    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "Berlin"));
        flights.add(new Flight("Berlin", "Paris"));
        flights.add(new Flight("Paris", "London"));
        flights.add(new Flight("London", "New York"));
        flights.add(new Flight("New York", "Tokyo"));
        flights.add(new Flight("Tokyo", "Sydney"));
        return flights;
    }

}
