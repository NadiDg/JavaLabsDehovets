package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testSetAndGetSide() {
        Square square = new Square(5.0);
        assertEquals(5.0, square.getSide());
        square.setSide(10.0);
        assertEquals(10.0, square.getSide());
    }

    @Test
    void testCalculateArea() {
        Square square = new Square(4.0);
        assertEquals(16.0, square.calculateArea());
    }

    @Test
    void testCalculatePerimeter() {
        Square square = new Square(4.0);
        assertEquals(16.0, square.calculatePerimeter());
    }

    @Test
    void testInvalidSide() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Square(-1.0);
        });
        assertEquals("Сторона має бути додатньою", exception.getMessage());
    }

    @Test
    void testEqualsAndHashCode() {
        Square square1 = new Square(5.0);
        Square square2 = new Square(5.0);
        assertEquals(square1, square2);
        assertEquals(square1.hashCode(), square2.hashCode());
    }
}



