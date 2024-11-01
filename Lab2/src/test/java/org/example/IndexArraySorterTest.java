package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IndexArraySorterTest {
    private IndexArraySorter _indexArraySorterTest = new IndexArraySorter();
    private int[] _arrayA;

    @BeforeEach
    void setUp() {
        _arrayA = new int[] {10, 22, 14, 26, 19};  // Масив для завдання 22
    }

    @Test
    void sortIndicesByValues() {
        var _arrayB = _indexArraySorterTest.sortIndicesByValues(_arrayA);
        int[] trueResult = {3, 1, 4, 2, 0};
        assertArrayEquals(_arrayB,trueResult);
    }
}
