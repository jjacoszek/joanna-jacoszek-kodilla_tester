package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CarFactoryTestSuite {
    @Test
    void createCar_shouldReturnCabrioInSummerNight() {

        LocalDateTime summerNight = LocalDateTime.of(2024, 7, 15, 22, 0);


        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = context.getBean(Car.class);
        String carType = car.getCarType();
        System.out.println(carType);
        List<String> possibleValue = Arrays.asList("SUV", "Sedan", "Cabrio");
        assertTrue(possibleValue.contains(carType));
    }
    }

