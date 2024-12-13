package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class AddressBookTest {

    @Test
    public void testAddressBookConstructorAndGetters() {
        AddressBook person = new AddressBook(
                "Бондаренко Петро Григорович",
                "+380123456789",
                LocalDate.of(1990, 5, 15),
                LocalDate.of(2024, 12, 13) // Поточна дата для тестування
        );

        assertEquals("Бондаренко Петро Григорович", person.getFullName());
        assertEquals("+380123456789", person.getPhoneNumber());
        assertEquals(LocalDate.of(1990, 5, 15), person.getBirthDate());
        assertEquals(LocalDate.of(2024, 12, 13), person.getDate());
    }

    @Test
    public void testInvalidFullName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new AddressBook(
                    "",
                    "+380123456789",
                    LocalDate.of(1990, 5, 15),
                    LocalDate.of(2024, 12, 13)
            );
        });
    }

    @Test
    public void testInvalidPhoneNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            new AddressBook(
                    "Бондаренко Петро Григорович",
                    "",
                    LocalDate.of(1990, 5, 15),
                    LocalDate.of(2024, 12, 13)
            );
        });
    }

    @Test
    public void testInvalidBirthDate() {
         assertThrows(IllegalArgumentException.class, () -> {
            new AddressBook(
                    "Бондаренко Петро Григорович",
                    "+380123456789",
                    LocalDate.of(2030, 5, 15),
                    LocalDate.of(2024, 12, 13)
            );
        });
    }

    @Test
    public void testSetDateInBaseClass() {
        // Тест перевіряє, що базовий клас Date працює коректно
        Date date = new Date(LocalDate.of(2024, 12, 13));
        assertEquals(LocalDate.of(2024, 12, 13), date.getDate());

        // Змінюємо дату
        date.setDate(LocalDate.of(2025, 1, 1));
        assertEquals(LocalDate.of(2025, 1, 1), date.getDate());
    }
}





