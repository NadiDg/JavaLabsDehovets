package org.example;

public class ArgumentTypeAnalyzer {
    public static boolean isFloat(String arg) {
        String regex = "^[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?$";
        return arg.matches(regex);
    }

    public static void analyzeArguments(String[] args) {
        System.out.println("Кількість аргументів: " + args.length);

        for (String arg : args) {
            if (arg.trim().isEmpty()) {
                System.out.println("Введено порожній рядок!");
            } else {
                if (isFloat(arg)) {
                    System.out.println("Тип: Float, Значення: " + arg);
                } else {
                    System.out.println("Тип: String, Значення: " + arg);
                }
            }
        }
    }
}

