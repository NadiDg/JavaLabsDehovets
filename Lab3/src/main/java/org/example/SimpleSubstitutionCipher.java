package org.example;

public class SimpleSubstitutionCipher {

    // Метод для шифрування тексту
    public static String encrypt(String plainText, String key) {
        if (isInvalidInput(plainText)) {
            return "Помилка: Введено порожній рядок!";
        }
        if (isInvalidKey(key)) {
            return "Помилка: Невалідний ключ шифрування!";
        }

        StringBuilder encryptedText = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (char c : plainText.toLowerCase().toCharArray()) {
            if (alphabet.indexOf(c) != -1) { // Перевірка, чи є символ в алфавіті
                int index = alphabet.indexOf(c);
                encryptedText.append(key.charAt(index)); // Додаємо зашифрований символ
            } else {
                encryptedText.append(c); // Якщо символ не в алфавіті, додаємо його без змін
            }
        }
        return encryptedText.toString();
    }

    // Метод для розшифрування тексту
    public static String decrypt(String encryptedText, String key) {
        if (isInvalidInput(encryptedText)) {
            return "Помилка: Введено порожній рядок!";
        }
        if (isInvalidKey(key)) {
            return "Помилка: Невалідний ключ шифрування!";
        }

        StringBuilder decryptedText = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (char c : encryptedText.toLowerCase().toCharArray()) {
            if (key.indexOf(c) != -1) { // Перевірка, чи є символ в ключі
                int index = key.indexOf(c);
                decryptedText.append(alphabet.charAt(index)); // Додаємо розшифрований символ
            } else {
                decryptedText.append(c); // Якщо символ не в ключі, додаємо його без змін
            }
        }
        return decryptedText.toString();
    }

    private static boolean isInvalidInput(String text) {
        return text == null || text.trim().isEmpty();
    }

    private static boolean isInvalidKey(String key) {
        if (key == null || key.trim().isEmpty()) {
            return true;
        }

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        return key.length() != alphabet.length() || !key.chars().allMatch(Character::isLetter);
    }
}
