package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ArraySequenceCheckerTest {

    private ArraySequenceChecker _ArraySequenceChecker = new ArraySequenceChecker();
    private int[] _arrayA;

    @BeforeEach
    void setUp() {
        _arrayA = new int[] {10, 15, 20, 25};  //Масив для завдання 12
    }

    @Test
    void checkSequence() {
        var result = _ArraySequenceChecker.checkSequence(_arrayA);
        assertTrue(result == "Масив є строго зростаючою послідовністю.");
    }
}
