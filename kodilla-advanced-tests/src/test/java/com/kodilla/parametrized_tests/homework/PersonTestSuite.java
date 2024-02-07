package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTestSuite {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.StringPersonSource#provideStringsNormalBMI")
    public void testGetBMI(double heightInMeters, double weightInKilogram, String expectedCategory) {
        Person person = new Person(1.60,57);
        String actualCategory = person.getBMI();
        assertEquals(expectedCategory, actualCategory);
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.StringPersonSource#provideStringsUnderweightBMI")
    public void testGetBMI1(double heightInMeters, double weightInKilogram, String expectedCategory) {
        Person person = new Person(2.10,73);
        String actualCategory = person.getBMI();
        assertEquals(expectedCategory, actualCategory);
    }

}