package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class CarFactory {
    @Bean
    public Car createCar() {
        LocalDateTime now = LocalDateTime.now();

        // Sprawdź porę roku i godzine
        if (isSummer(now) && isNight(now)) {
            Cabrio cabrio = new Cabrio();
            cabrio.hasHeadlightsTurnedOn();
            return cabrio;

        } else if (isWinter(now) && isNight(now)) {
            SUV suv = new SUV();
            suv.hasHeadlightsTurnedOn();
            return suv;
        } else {
            Sedan sedan = new Sedan();
            sedan.hasHeadlightsTurnedOn();
            return sedan;
        }
    }

    private boolean isSummer(LocalDateTime dateTime) {
        int month = dateTime.getMonthValue();
        return month >= 6 && month <= 8; // Czerwiec, lipiec, sierpień są latem
    }

    private boolean isWinter(LocalDateTime dateTime) {
        int month = dateTime.getMonthValue();
        return month == 12 || (month >= 1 && month <= 2); // Grudzień, styczeń, luty są zimą
    }

    private boolean isNight(LocalDateTime dateTime) {
        int hour = dateTime.getHour();
        return hour >= 20 || hour < 6; // Światła włączone od 20:00 do 06:00
    }

}
