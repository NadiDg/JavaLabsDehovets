package org.example;

public class ArgumentParser {

    public static boolean isKeyed(String arg) {
        return arg.matches("^[a-zA-Zа-яА-ЯёЁ]+=[a-zA-Zа-яА-ЯёЁ]+$");
    }

    public static boolean isOptional(String arg) {
        return arg.matches("^[\\-/].+$");
    }

    public static boolean isImmediate(String arg) {
        return arg.matches("^[a-zA-Zа-яА-ЯёЁ0-9]+$");
    }

    public static boolean isEmptyOrWhitespace(String arg) {
        return arg == null || arg.trim().isEmpty(); // Перевірка на порожній рядок або рядок з пробілами
    }

    public static void analyzeArguments(String[] args) {
        System.out.println("Кількість аргументів: " + args.length);

        for (String arg : args) {
            if (isEmptyOrWhitespace(arg)) {
                System.out.println("Введено порожній рядок!");
            } else {
                if (isKeyed(arg)) {
                    String[] parts = arg.split("=");
                    System.out.println("Тип: Keyed, Параметр: " + parts[0] + ", Значення: " + parts[1]);
                } else if (isOptional(arg)) {
                    System.out.println("Тип: Optional, Значення: " + arg);
                } else if (isImmediate(arg)) {
                    System.out.println("Тип: Immediate, Значення: " + arg);
                } else {
                    System.out.println("Тип: Невідомий, Значення: " + arg);
                }
            }
        }
    }
}


