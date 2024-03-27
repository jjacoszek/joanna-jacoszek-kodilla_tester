package com.kodilla.jacoco;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


    class YearTest {

        @ParameterizedTest
        @CsvSource({
                "1600, true",
                "2019, false",
                "2020, true",
                "1900, false",
                "2000, true"
        })
        void shouldBeLeapYear(int year, boolean expected) {
            //given
            Year testedYear = new Year(year);

            //when
            boolean isLeapYear = testedYear.isLeap();

            //then
            assertEquals(expected, isLeapYear);
        }
    }
