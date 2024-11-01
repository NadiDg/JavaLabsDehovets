package org.example;

public class ArraySequenceChecker {

    // Метод для перевірки типу впорядкування масиву
    public static String checkSequence(int[] array) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                isIncreasing = false;
            }
            if (array[i] <= array[i + 1]) {
                isDecreasing = false;
            }
        }

        if (isIncreasing) {
            return "Масив є строго зростаючою послідовністю.";
        } else if (isDecreasing) {
            return "Масив є строго спадною послідовністю.";
        } else {
            return "Елементи масиву не впорядковані.";
        }
    }

}