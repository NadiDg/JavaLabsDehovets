package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArgumentTypeAnalyzerTest {

    // Тест для методу isFloat
    @Test
    void testIsFloat() {
        assertTrue(ArgumentTypeAnalyzer.isFloat("3.14"));
        assertTrue(ArgumentTypeAnalyzer.isFloat("-0.5"));
        assertTrue(ArgumentTypeAnalyzer.isFloat("+3.0"));
        assertTrue(ArgumentTypeAnalyzer.isFloat("1e3"));
        assertTrue(ArgumentTypeAnalyzer.isFloat("2E-10"));
        assertFalse(ArgumentTypeAnalyzer.isFloat("abc"));
        assertFalse(ArgumentTypeAnalyzer.isFloat("123abc"));
    }
}