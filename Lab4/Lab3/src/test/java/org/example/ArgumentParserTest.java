package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArgumentParserTest {

    // Тест для методу isKeyed
    @Test
    void testIsKeyed() {
        assertTrue(ArgumentParser.isKeyed("key=value"));
        assertTrue(ArgumentParser.isKeyed("ключ=значення"));
        assertFalse(ArgumentParser.isKeyed("keyvalue"));
        assertFalse(ArgumentParser.isKeyed("key=value=extra"));
        assertFalse(ArgumentParser.isKeyed("key="));
        assertFalse(ArgumentParser.isKeyed("=value"));
    }

    // Тест для методу isOptional
    @Test
    void testIsOptional() {
        assertTrue(ArgumentParser.isOptional("-option"));
        assertTrue(ArgumentParser.isOptional("/option"));
        assertFalse(ArgumentParser.isOptional("key=value"));
        assertFalse(ArgumentParser.isOptional("імя=значення"));
        assertFalse(ArgumentParser.isOptional("option"));
    }

    // Тест для методу isImmediate
    @Test
    void testIsImmediate() {
        assertTrue(ArgumentParser.isImmediate("argument123"));
        assertTrue(ArgumentParser.isImmediate("тест123"));
        assertFalse(ArgumentParser.isImmediate("-option"));
        assertFalse(ArgumentParser.isImmediate("key=value"));
    }

    @Test
    void testIsEmptyOrWhitespace() {
        assertTrue(ArgumentParser.isEmptyOrWhitespace(null));
        assertTrue(ArgumentParser.isEmptyOrWhitespace("   "));
        assertTrue(ArgumentParser.isEmptyOrWhitespace(""));
        assertFalse(ArgumentParser.isEmptyOrWhitespace("value"));
    }
}