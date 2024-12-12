package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringReverserTest {

    @Test
    void testReverseWithValidString() {
        String input = "Hello world!";
        String expected = "!dlrow olleH";
        String actual = StringReverser.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    void testReverseWithEmptyString() {
        String input = "";
        String expected = "Введено порожній рядок!";
        String actual = StringReverser.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    void testReverseWithStringOfSpaces() {
        String input = "     ";
        String expected = "Введено порожній рядок!";
        String actual = StringReverser.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    void testReverseWithNull() {
        String input = null;
        String expected = "Введено порожній рядок!";
        String actual = StringReverser.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    void testReverseWithSingleCharacter() {
        String input = "a";
        String expected = "a";
        String actual = StringReverser.reverse(input);
        assertEquals(expected, actual);
    }
}