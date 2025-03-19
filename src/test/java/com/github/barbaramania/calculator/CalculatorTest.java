package com.github.barbaramania.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple Addition 2")
    void testSubtract() {
        assertEquals(2, calculator.subtract(4, 2), "Simple subs");
        assertEquals(-6, calculator.subtract(-4, 2), "Subs Negative");
    }

    @Test
    @DisplayName("Simple Addition 2")
    void testDivide() {
        assertEquals(3, calculator.divide(6, 2), "Simple div");
        assertEquals(-3, calculator.divide(-6, 2), "Div Negative");
    }

    @Test
    @DisplayName("Simple Addition 2")
    void testAdd() {
        assertEquals(6, calculator.add(4, 2), "Simple addition");
        assertEquals(-2, calculator.add(-4, 2), "Sum Negative");
    }

    @Test
    @DisplayName("Division by zero should throw an ArithmeticException")
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }


}