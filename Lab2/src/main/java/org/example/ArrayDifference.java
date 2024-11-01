package org.example;

public class ArrayDifference {

    // Метод для знаходження абсолютного значення найменшої різниці
    public static int findMinAbsDifference(int[] array) {
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int difference = Math.abs(array[i] - array[j]);
                if (difference < minDifference) {
                    minDifference = difference;
                }
            }
        }

        return minDifference;
    }
}