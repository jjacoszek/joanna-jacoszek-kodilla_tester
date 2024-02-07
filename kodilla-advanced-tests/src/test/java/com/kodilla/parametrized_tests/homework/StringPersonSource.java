package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class StringPersonSource {

    static Stream<Arguments> provideStringsNormalBMI() {
        return Stream.of(
                Arguments.of( 1.6, 57, "Normal (healthy weight)"),
                Arguments.of(1.75, 65, "Normal (healthy weight)"),
                Arguments.of(1.8, 90, "Normal (healthy weight)")


        );
    }

    static Stream<Arguments> provideStringsUnderweightBMI() {
        return Stream.of(
                Arguments.of( 1.9, 80, "Underweight"),
                Arguments.of(2.20, 90, "Underweight"),
                Arguments.of(1.8, 70, "Underweight")

        );
    }
}
