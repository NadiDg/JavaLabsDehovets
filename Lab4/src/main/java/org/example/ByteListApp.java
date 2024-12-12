package org.example;

import java.util.ArrayList;
import java.util.List;

public class ByteListApp {

    public static void main(String[] args) {
        // Створення списку типу Byte з 5 елементами
        List<Byte> byteList = new ArrayList<>();
        byteList.add((byte) 10);
        byteList.add((byte) 20);
        byteList.add((byte) 30);
        byteList.add((byte) 40);
        byteList.add((byte) 50);

        // Виведення початкового списку
        System.out.println("Початковий список:");
        printList(byteList);

        // Зміна значення елемента в списку
        System.out.println("\nЗміна значення елемента за індексом 2:");
        byteList.set(2, (byte) 100); // Зміна значення елемента на індексі 2
        printList(byteList);

        // Зміна значення елемента в списку
        System.out.println("\nЗміна значення елемента за індексом 4:");
        byteList.set(4, (byte) 200); // Зміна значення елемента на індексі 4
        printList(byteList);

        // Виведення конкретного елемента
        System.out.println("\nЕлемент за індексом 1: " + byteList.get(1));

        // Виведення списку після змін
        System.out.println("\nОновлений список:");
        printList(byteList);
    }

    // Метод для виведення списку
    private static void printList(List<Byte> byteList) {
        for (Byte byteElement : byteList) {
            System.out.print(byteElement + " ");
        }
        System.out.println();
    }
}









