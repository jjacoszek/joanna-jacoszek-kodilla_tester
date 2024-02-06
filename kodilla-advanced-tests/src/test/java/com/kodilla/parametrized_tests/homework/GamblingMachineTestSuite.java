package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineTestCases.csv", numLinesToSkip = 1)
    void shouldCountWinsCorrectly(String userNumbersString, int expectedWins) throws InvalidNumbersException {
        // Arrange
        Set<Integer> numbers = gamblingMachine.generateComputerNumbers();

        // Act
        int actualWins = gamblingMachine.howManyWins(numbers);

        // Assert
        assertEquals(expectedWins, actualWins);
    }

}
