package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    public void testCalc() {
        Calc c = new Calc();
        int actualResult = c.divide(10, 5);
        int expectedResult = 2;
        
        assertEquals(expectedResult, actualResult);
    }
}
