package com.assignment.my_assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
    @Test
    public void additionTestCase() {
    	Calculator calc = new Calculator();
    	assertEquals(25, calc.add(10, 15));
    	assertEquals(125, calc.add(100, 25));
    }
    
    @Test
    public void substractionTestCase() {
    	Calculator calc = new Calculator();
    	assertEquals(15, calc.subtract(20, 5));
    	assertEquals(75, calc.subtract(100, 25));
    }
    
    @Test
    public void multiplicationTestCase() {
    	Calculator calc = new Calculator();
    	assertEquals(15, calc.multiply(1, 15));
    	assertEquals(2500, calc.multiply(100, 25));
    }
}
