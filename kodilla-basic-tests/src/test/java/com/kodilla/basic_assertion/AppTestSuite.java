package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTestSuite {

    @Test
    void sumResult() {
        Calculator calculator = new Calculator(4.00, 25.00);
        double sumResult = calculator.sumDisplay();
        assertEquals(29, sumResult);
    }

}

    class AppTestSuite2 {
@Test
    void substractionResult(){
    Calculator calculator = new Calculator(4.00, 25.00);
    double substractionResult = calculator.substractionDisplay();
    assertEquals(21, substractionResult);

}
}

class AppTestSuite3 {

    @Test
    void squaringResult(){
        Calculator calculator = new Calculator(4.00, 25.00);
        double squaringResult = calculator.squaring();
        assertEquals(16.0000 , squaringResult,0, String.valueOf(0001));

    }


}