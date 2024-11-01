package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayTransformerTest {

    private ArrayTransformer _ArrayTransformer = new ArrayTransformer();
    private int[] _arrayA;
    @BeforeEach
    void setUp() {
        _arrayA = new int[] {10, 22, 14, 26, 19};  // Масив для завдання 17
    }

    @Test
    void transformArray() {
        var transA = _ArrayTransformer.transformArray(_arrayA);
        int[] trueResult = {16, 4, 12, 0, 7};
        assertArrayEquals(transA,trueResult);
    }
}
