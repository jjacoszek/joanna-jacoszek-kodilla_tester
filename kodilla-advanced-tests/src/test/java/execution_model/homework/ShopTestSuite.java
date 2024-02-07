package execution_model.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTestSuite {
    private Shop myShop;

    @BeforeEach
    public void setUp() {
        // Inicjalizacja przed każdym testem
        myShop = new Shop();

        // Dodanie kilku zamówień do myShop
        myShop.addOrder(new Order(100.50, "2021-02-17", "user1"));
        myShop.addOrder(new Order(75.25, "2023-01-10", "user2"));
        myShop.addOrder(new Order(150.0, "2022-03-05", "user1"));
    }

    @AfterEach
    public void tearDown() {
        // Czyszczenie po każdym teście
        myShop = null;
    }

    @Test
    public void testGetNumberOfOrders() {
        // Test metody getNumberOfOrders
        assertEquals(3, myShop.getNumberOfOrders());
    }

    @Test
    public void testGetTotalOrderValue() {
        // Test metody getTotalOrderValue
        assertEquals(325.75, myShop.getTotalOrderValue(), 0.01);
    }

    @Test
    public void testGetOrdersBetweenDates() throws ParseException {
        // Test metody getOrdersBetweenDates

        // Ustawienie zakresu dat
        String startDate = "2021-01-01";
        String endDate = "2023-01-01";

        // Oczekiwana liczba zamówień w zakresie dat
        int expectedCount = 2;

        // Wywołanie metody i pobranie wyniku
        List<Order> resultOrders = myShop.getOrdersBetweenDates(startDate, endDate);

        // Sprawdzenie, czy liczba zamówień jest zgodna z oczekiwaniami
        assertEquals(expectedCount, resultOrders.size());
    }

    @Test
    public void testGetOrdersByValueRange() {
        // Test metody getOrdersByValueRange

        // Ustawienie zakresu wartości zamówień
        double minValue = 80.0;
        double maxValue = 200.0;

        // Oczekiwana liczba zamówień w zakresie wartości
        int expectedCount = 2;

        // Wywołanie metody i pobranie wyniku
        List<Order> resultOrders = myShop.getOrdersByValueRange(minValue, maxValue);

        // Sprawdzenie, czy liczba zamówień jest zgodna z oczekiwaniami
        assertEquals(expectedCount, resultOrders.size());
    }



}