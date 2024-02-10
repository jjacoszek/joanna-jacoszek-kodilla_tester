package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTestSuite {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.StringPersonSource#provideStringsNormalBMI")
    public void testGetBMI(double heightInMeters, double weightInKilogram, String expectedCategory) {
        Person person = new Person(heightInMeters,weightInKilogram);
        String actualCategory = person.getBMI();
        assertEquals(expectedCategory, actualCategory);
    }

}