package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
    Display bean = context.getBean(Display.class);
    Calculator calculator = context.getBean(Calculator.class);
    @Test
    public void shouldDisplayValue() {
        double value = bean.display(14);
        Assertions.assertNotNull(value);
    }
    @Test
    void shouldReturnAddOutcome() {
        double result = calculator.add(10, 4);
        Assertions.assertEquals(14, result);
    }

    @Test
    void shouldReturnSubstractOutcome() {
        double result = calculator.subtract(10, 4);
        Assertions.assertEquals(6, result);
    }

    @Test
    void shouldReturnMultiplyOutcome() {
        double result = calculator.multiply(2, 4);
        Assertions.assertEquals(8, result);
    }

    @Test
    void shouldReturnDiOutcome() {
        double result = calculator.divide(8, 4);
        Assertions.assertEquals(2, result);
    }
}





