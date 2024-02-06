package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();
    @ParameterizedTest
    @CsvSource({
            "user123, true",
            "user-name, true",
            "123user, true",
            "u, false",
            "user.name, true",
            "_username, true",
            "user@name, false",
            "user!, false",
            "user space, false",
            "user@domain.com, false",
            "user-name_123, true",
            "user_123, true",
            "user-123, true",
            "user.name_123, true"
    })
    public void testUsernameValidation(String username, boolean expected) {
        assertEquals(expected, userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @CsvSource({
            "test@example.com, true",
            "user123, false",
            "invalid.email, false",
            "john.doe@company.co.uk, true",
            "user-name_123@example.org, true",
            ", false",
            "user@.com, false",
            "user@domain..com, false",
            "user@domain-with-dash.com, true",
            "user@123.com, true",
            "user@domain, false",
            "user@.com, false",
            "user@domain.com123, false"
    })
    public void testEmailValidation(String email, boolean expected) {
        assertEquals(expected, userValidator.validateEmail(email));
    }
}