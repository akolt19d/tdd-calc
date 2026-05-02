package tdd.calc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    // ADD
    @Test
    void addsTwoPositiveNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(6.0, calculator.add(2.0, 4.0));
    }

    @Test
    void addsTwoNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-67.0, calculator.add(-60.0, -7.0));
    }

    @Test
    void addsPositiveAndNegative() {
        Calculator calculator = new Calculator();
        assertEquals(-2.0, calculator.add(2.0, -4.0));
    }

    @Test
    void addsZero() {
        Calculator calculator = new Calculator();
        assertEquals(0.0, calculator.add(0.0, 0.0));
    }

    @Test
    void addsDecimals() {
        Calculator calculator = new Calculator();
        assertEquals(6.7, calculator.add(3.2, 3.5), 0.0001);
    }

    // SUBTRACT
    @Test
    void subtractsTwoPositiveNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-2.0, calculator.subtract(2.0, 4.0));
    }

    @Test
    void subtractsTwoNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-53.0, calculator.subtract(-60.0, -7.0));
    }

    @Test
    void subtractsPositiveAndNegative() {
        Calculator calculator = new Calculator();
        assertEquals(6.0, calculator.subtract(2.0, -4.0));
    }

    @Test
    void subtractsZero() {
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.subtract(5.0, 0.0));
    }

    @Test
    void subtractsDecimals() {
        Calculator calculator = new Calculator();
        assertEquals(6.7, calculator.subtract(9.9, 3.2), 0.0001);
    }

    // MULTIPLY
    @Test
    void multipliesTwoPositiveNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(8.0, calculator.multiply(2.0, 4.0));
    }

    @Test
    void multipliesTwoNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(6.0, calculator.multiply(-2.0, -3.0));
    }

    @Test
    void multipliesPositiveAndNegative() {
        Calculator calculator = new Calculator();
        assertEquals(-6.0, calculator.multiply(2.0, -3.0));
    }

    @Test
    void multipliesByZero() {
        Calculator calculator = new Calculator();
        assertEquals(0.0, calculator.multiply(5.0, 0.0));
    }

    @Test
    void multipliesDecimals() {
        Calculator calculator = new Calculator();
        assertEquals(3.75, calculator.multiply(2.5, 1.5), 0.0001);
    }

    // DIVIDE
    @Test
    void dividesTwoPositiveNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(4.0, 2.0));
    }

    @Test
    void dividesTwoNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(-4.0, -2.0));
    }

    @Test
    void dividesPositiveAndNegative() {
        Calculator calculator = new Calculator();
        assertEquals(-2.0, calculator.divide(4.0, -2.0));
    }

    @Test
    void dividesDecimals() {
        Calculator calculator = new Calculator();
        assertEquals(1.5, calculator.divide(7.5, 5.0), 0.0001);
    }

    @Test
    void canDivideZero() {
        Calculator calculator = new Calculator();
        assertEquals(0.0, calculator.divide(0.0, 10.0));
    }

    @Test
    void cannotDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10.0, 0.0));
    }
}
