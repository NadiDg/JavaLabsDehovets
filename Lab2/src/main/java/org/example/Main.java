package org.example;

public class Main {
    public static void main(String[] args) {
        int[] a7 = {10, 22, 14, 26, 19}; //масив для завдання 7
        // Виклик методу
        int minAbsDifference = ArrayDifference.findMinAbsDifference(a7);

        System.out.println("Завдання 7. Абсолютне значення найменшої різниці: " + minAbsDifference);

        int[] a12 = {10, 15, 20, 25};  //Масив для завдання 12

        String result = ArraySequenceChecker.checkSequence(a12);
        System.out.println("Завдання 12. " + result);

        int[] a17 = {10, 22, 14, 26, 19};  // Масив для завдання 17

        // Виклик методу для формування масиву b
        int[] transC = ArrayTransformer.transformArray(a17);

        // Вивести масив b
        System.out.print("Завдання 17. Масив b: ");
        for (int value : transC) {
            System.out.print(value + " ");
        }
        System.out.println();

        int[] a22 = {10, 22, 14, 26, 19};  // Масив для завдання 22

        // Виклик методу для формування масиву b
        int[] b22 = IndexArraySorter.sortIndicesByValues(a22);

        // Вивести масив b
        System.out.print("Завдання 22. Масив b (індекси в порядку спадання): ");
        for (int value : b22) {
            System.out.print(value + " ");
        }
        System.out.println();

        int[] a27 = {10, 22, 14, 26, 19};  // Масив A для завдання 27
        int[] b27 = {22, 30, 14, 10, 40};  // Масив B для завадання 27
        System.out.print("Завдання 27.");
        // Виклик методу для визначення рівних елементів
        ArrayComparer.findEqualElements(a27, b27);
    }
}