package com.kodilla.stream;

import java.util.List;

public class CustomStreamExample {

    public static int squareAndSum(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num > 0)  // Filtruje tylko liczby dodatnie
                .mapToInt(num -> num * num)  // Podnosi każdą liczbę do kwadratu
                .sum();  // Sumuje wyniki
    }
}
