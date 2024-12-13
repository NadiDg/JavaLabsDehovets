package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class FractionTest {

    @Test
    void testAddition() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction result = f1.add(f2);
        assertEquals(new Fraction(5, 6), result);
    }

    @Test
    void testSubtraction() {
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(1, 4);
        Fraction result = f1.subtract(f2);
        assertEquals(new Fraction(1, 2), result);
    }

    @Test
    void testMultiplication() {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(3, 4);
        Fraction result = f1.multiply(f2);
        assertEquals(new Fraction(1, 2), result);
    }

    @Test
    void testDivision() {
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(2, 5);
        Fraction result = f1.divide(f2);
        assertEquals(new Fraction(15, 8), result);
    }

    @Test
    void testSimplify() {
        Fraction f = new Fraction(4, 8);
        assertEquals(new Fraction(1, 2), f);
    }

    @Test
    void testToString() {
        Fraction f = new Fraction(3, 4);
        assertEquals("3/4", f.toString());
    }

    @Test
    void testEquality() {
        Fraction f1 = new Fraction(2, 4);
        Fraction f2 = new Fraction(1, 2);
        assertEquals(f1, f2); // 2/4 == 1/2
    }

    @Test
    void testZeroDenominator() {
        assertThrows(IllegalArgumentException.class, () -> new Fraction(1, 0));
    }

    @Test
    void testDivisionByZero() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(0, 1);
        assertThrows(ArithmeticException.class, () -> f1.divide(f2));
    }
}




