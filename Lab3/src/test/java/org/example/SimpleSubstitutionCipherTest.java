package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleSubstitutionCipherTest {

    @Test
    void testEncryptWithValidInput() {
        String plainText = "hello world";
        String key = "qazwsxerdctfvgbynhujmkiolp";
        String expected = "rsffb ibhfw";
        String actual = SimpleSubstitutionCipher.encrypt(plainText, key);
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptWithEmptyInput() {
        String plainText = "";
        String key = "qazwsxedcrfvtgbyhnujmikolp";
        String expected = "Помилка: Введено порожній рядок!";
        String actual = SimpleSubstitutionCipher.encrypt(plainText, key);
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptWithNullInput() {
        String plainText = null;
        String key = "qazwsxedcrfvtgbyhnujmikolp";
        String expected = "Помилка: Введено порожній рядок!";
        String actual = SimpleSubstitutionCipher.encrypt(plainText, key);
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptWithInvalidKey() {
        String plainText = "hello";
        String key = "invalidkey";
        String expected = "Помилка: Невалідний ключ шифрування!";
        String actual = SimpleSubstitutionCipher.encrypt(plainText, key);
        assertEquals(expected, actual);
    }

    @Test
    void testDecryptWithValidInput() {
        String encryptedText = "rsffb ibhfw";
        String key = "qazwsxerdctfvgbynhujmkiolp";
        String expected = "hello world";
        String actual = SimpleSubstitutionCipher.decrypt(encryptedText, key);
        assertEquals(expected, actual);
    }

    @Test
    void testDecryptWithEmptyInput() {
        String encryptedText = "";
        String key = "qazwsxedcrfvtgbyhnujmikolp";
        String expected = "Помилка: Введено порожній рядок!";
        String actual = SimpleSubstitutionCipher.decrypt(encryptedText, key);
        assertEquals(expected, actual);
    }

    @Test
    void testDecryptWithNullInput() {
        String encryptedText = null;
        String key = "qazwsxedcrfvtgbyhnujmikolp";
        String expected = "Помилка: Введено порожній рядок!";
        String actual = SimpleSubstitutionCipher.decrypt(encryptedText, key);
        assertEquals(expected, actual);
    }

    @Test
    void testDecryptWithInvalidKey() {
        String encryptedText = "itssg";
        String key = "invalidkey";
        String expected = "Помилка: Невалідний ключ шифрування!";
        String actual = SimpleSubstitutionCipher.decrypt(encryptedText, key);
        assertEquals(expected, actual);
    }
}