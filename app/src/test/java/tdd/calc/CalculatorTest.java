package tdd.calc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

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
        assertEquals(6.7, calculator.add(3.2, 3.5));
    }
}
