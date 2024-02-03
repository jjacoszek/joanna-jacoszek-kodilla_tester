package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class WarehouseTest {
    @Test
    void shouldThrowOrderDoesntExistException() {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("456"));

        // when + then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("789"));
    }

}