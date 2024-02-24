package com.kodilla.spring.basic.dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ShippingCenterTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    ShippingCenter shippingCenter = context.getBean(ShippingCenter.class);

    @Test
    void testSendPackageSuccess() {

        String address = "123 Main St";
        double weight = 25.0;

        String result = shippingCenter.sendPackage(address, weight);
        assertEquals("Package delivered to: " + address, result);
    }


    @Test
    void testSendPackageFailure() {
        String address = "123 Main St";
        double weight = 35.0;

        String result = shippingCenter.sendPackage(address, weight);
        assertEquals("Package not delivered to: " + address, result);
    }
}
