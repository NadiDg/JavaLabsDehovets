package org.example;


public class Main {
    public static void main(String[] args) {
        //Завдання 8
        String inputString8 = "Hello world!";
        String reversedString = StringReverser.reverse(inputString8);
        System.out.println("Оригінальний рядок: " + inputString8);
        System.out.println("Перевернутий рядок: " + reversedString);

        //Завдання 13
        String key = "qazwsxerdctfvgbynhujmkiolp"; // Ключ шифрування
        String plainText = "hello world";
        // Шифрування
        String encryptedText = SimpleSubstitutionCipher.encrypt(plainText, key);
        System.out.println("Зашифрований текст: " + encryptedText);
        // Розшифрування
        String decryptedText = SimpleSubstitutionCipher.decrypt(encryptedText, key);
        System.out.println("Розшифрований текст: " + decryptedText);


        //Завдання 18
        String[] inputString18 = {"-5.58", "java", "5.34","meow"};
        ArgumentTypeAnalyzer.analyzeArguments(inputString18);

        //Завдання 22
        String[] inputString22 = {"cat=Tyson", "-meow", "/cat", "something", "java", "cat=Maria"};
        ArgumentParser.analyzeArguments(inputString22);
    }
}