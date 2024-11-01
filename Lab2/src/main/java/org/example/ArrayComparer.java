package org.example;


import java.util.ArrayList;
import java.util.List;

public class ArrayComparer {

    // Метод для визначення кількості рівних елементів та їх індексів
    public static List<Integer> findEqualElements(int[] arrayA, int[] arrayB) {
        List<Integer> indicesA = new ArrayList<>();
        List<Integer> indicesB = new ArrayList<>();
        int count = 0;

        // Перебираємо масив a та шукаємо рівні елементи в масиві b
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] == arrayB[j]) {
                    count++;
                    indicesA.add(i);
                    indicesB.add(j);
                }
            }
        }

        // Виводимо результати
        System.out.println("Кількість рівних елементів: " + count);
        if (count > 0) {
            System.out.print("Індекси в масиві A: ");
            for (int index : indicesA) {
                System.out.print(index + " ");
            }
            System.out.println(); // Перехід на новий рядок

            System.out.print("Індекси в масиві B: ");
            for (int index : indicesB) {
                System.out.print(index + " ");
            }
            System.out.println(); // Перехід на новий рядок
        } else {
            System.out.println("Однакових елементів не знайдено.");
        }
        return indicesA;
    }
}