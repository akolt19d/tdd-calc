package tdd.calc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    // ADD
    @Test
    void addsTwoPositiveNumbers() {
        assertEquals(6.0, Calculator.add(2.0, 4.0));
    }

    @Test
    void addsTwoNegativeNumbers() {
        assertEquals(-67.0, Calculator.add(-60.0, -7.0));
    }

    @Test
    void addsPositiveAndNegative() {
        assertEquals(-2.0, Calculator.add(2.0, -4.0));
    }

    @Test
    void addsZero() {
        assertEquals(0.0, Calculator.add(0.0, 0.0));
    }

    @Test
    void addsDecimals() {
        assertEquals(6.7, Calculator.add(3.2, 3.5), 0.0001);
    }

    // SUBTRACT
    @Test
    void subtractsTwoPositiveNumbers() {
        assertEquals(-2.0, Calculator.subtract(2.0, 4.0));
    }

    @Test
    void subtractsTwoNegativeNumbers() {
        assertEquals(-53.0, Calculator.subtract(-60.0, -7.0));
    }

    @Test
    void subtractsPositiveAndNegative() {
        assertEquals(6.0, Calculator.subtract(2.0, -4.0));
    }

    @Test
    void subtractsZero() {
        assertEquals(5.0, Calculator.subtract(5.0, 0.0));
    }

    @Test
    void subtractsDecimals() {
        assertEquals(6.7, Calculator.subtract(9.9, 3.2), 0.0001);
    }

    // MULTIPLY
    @Test
    void multipliesTwoPositiveNumbers() {
        assertEquals(8.0, Calculator.multiply(2.0, 4.0));
    }

    @Test
    void multipliesTwoNegativeNumbers() {
        assertEquals(6.0, Calculator.multiply(-2.0, -3.0));
    }

    @Test
    void multipliesPositiveAndNegative() {
        assertEquals(-6.0, Calculator.multiply(2.0, -3.0));
    }

    @Test
    void multipliesByZero() {
        assertEquals(0.0, Calculator.multiply(5.0, 0.0));
    }

    @Test
    void multipliesDecimals() {
        assertEquals(3.75, Calculator.multiply(2.5, 1.5), 0.0001);
    }

    // DIVIDE
    @Test
    void dividesTwoPositiveNumbers() {
        assertEquals(2.0, Calculator.divide(4.0, 2.0));
    }

    @Test
    void dividesTwoNegativeNumbers() {
        assertEquals(2.0, Calculator.divide(-4.0, -2.0));
    }

    @Test
    void dividesPositiveAndNegative() {
        assertEquals(-2.0, Calculator.divide(4.0, -2.0));
    }

    @Test
    void dividesDecimals() {
        assertEquals(1.5, Calculator.divide(7.5, 5.0), 0.0001);
    }

    @Test
    void canDivideZero() {
        assertEquals(0.0, Calculator.divide(0.0, 10.0));
    }

    @Test
    void cannotDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(10.0, 0.0));
    }
}
