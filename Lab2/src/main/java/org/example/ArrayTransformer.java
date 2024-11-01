package org.example;

public class ArrayTransformer {

    // Метод для формування масиву b
    public static int[] transformArray(int[] array) {
        int max = Integer.MIN_VALUE;

        // Знайти максимальне значення в масиві a
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        // Створити новий масив b і заповнити його значеннями за алгоритмом
        int[] b = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            b[i] = max - array[i];
        }

        return b;
    }
}