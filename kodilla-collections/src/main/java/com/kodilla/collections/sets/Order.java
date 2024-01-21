package com.kodilla.collections.sets;

import java.util.Objects;

public class Order {

        private String orderNumber;
        private String productName;
        private double Quantity;

    public Order(String orderNumber, String productName, double quantity) {
        this.orderNumber = orderNumber;
        this.productName = productName;
        Quantity = quantity;
    }

    public String getOrderNumber() {
        return orderNumber;
    }
    public String getProductName() {
        return productName;
    }
    public double getQuantity() {
        return Quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(Quantity, order.Quantity) == 0 && Objects.equals(orderNumber, order.orderNumber) && Objects.equals(productName, order.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, productName, Quantity);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", productName='" + productName + '\'' +
                ", Quantity=" + Quantity +
                '}';
    }
}


