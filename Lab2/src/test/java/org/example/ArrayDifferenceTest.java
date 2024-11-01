package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayDifferenceTest {

    private ArrayDifference _ArrayDifference = new ArrayDifference();
    private int[] _arrayA;

    @BeforeEach
    void setUp() {
        _arrayA = new int[] {10, 22, 14, 26, 19}; //масив для завдання 7
    }

    @Test
    void findMinAbsDifference() {
        var minAbsDifference = _ArrayDifference.findMinAbsDifference(_arrayA);
        assertTrue(minAbsDifference == 3);
    }
}