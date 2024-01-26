package com.kodilla.collections.adv.exercises.dictionary.com.kodilla.collections.adv.exercises;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    @Test
    public void shouldFindFlightsFromGivenDeparture() {
        // given
        FlightFinder flightFinder = new FlightFinder();

        // when
        List<Flight> flightsFromWarsaw = flightFinder.findFlightsFrom("Warsaw");

        // then
        assertEquals(1, flightsFromWarsaw.size());
        assertEquals("Warsaw", flightsFromWarsaw.get(0).getDeparture());
    }

    @Test
    public void shouldFindFlightsToGivenArrival() {
        // given
        FlightFinder flightFinder = new FlightFinder();

        // when
        List<Flight> flightsToParis = flightFinder.findFlightsTo("Paris");

        // then
        assertEquals(1, flightsToParis.size());
        assertEquals("Paris", flightsToParis.get(0).getArrival());
    }

    @Test
    public void shouldNotFindFlightsFromNonexistentDeparture() {
        // given
        FlightFinder flightFinder = new FlightFinder();

        // when
        List<Flight> flightsFromNonexistentCity = flightFinder.findFlightsFrom("NonexistentCity");

        // then
        assertEquals(0, flightsFromNonexistentCity.size());
    }

    @Test
    public void shouldNotFindFlightsToNonexistentArrival() {
        // given
        FlightFinder flightFinder = new FlightFinder();

        // when
        List<Flight> flightsToNonexistentCity = flightFinder.findFlightsTo("NonexistentCity");

        // then
        assertEquals(0, flightsToNonexistentCity.size());
    }

}