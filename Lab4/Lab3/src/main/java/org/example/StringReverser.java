package org.example;

public class StringReverser {

    public static String reverse(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "Введено порожній рядок!";
        }
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}



