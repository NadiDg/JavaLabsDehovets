package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class IndexArraySorter {

    // Метод для формування масиву b з індексами елементів масиву a
    public static int[] sortIndicesByValues(int[] array) {
        // Створити масив індексів
        Integer[] indices = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            indices[i] = i; // Заповнити масив індексами
        }

        // Сортуємо індекси в порядку спадання значень з масиву a
        Arrays.sort(indices, new Comparator<Integer>() {
            @Override
            public int compare(Integer index1, Integer index2) {
                return Integer.compare(array[index2], array[index1]); // Убування
            }
        });

        // Перетворити Integer[] в int[]
        return Arrays.stream(indices).mapToInt(Integer::intValue).toArray();
    }

}