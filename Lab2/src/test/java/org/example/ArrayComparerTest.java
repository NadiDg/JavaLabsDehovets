package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayComparerTest {

    private ArrayComparer _arrayComparer = new ArrayComparer();
    private int[] _arrayA;
    private int[] _arrayB;

    @BeforeEach
    void setUp() {
        _arrayA = new int[] {10, 22, 14, 26, 19};  // Масив A для завдання 27
        _arrayB = new int[] {22, 30, 14, 10, 40};  // Масив B для завадання 27
    }

    @Test
    void findEqualElements() {
        var indicesA = _arrayComparer.findEqualElements(_arrayA, _arrayB);
        assertTrue(indicesA.toArray().length == 3);
    }
}