package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class LibraryNetworkTest {

    private LibraryNetwork libraryNetwork;

    @BeforeEach
    void setUp() {
        libraryNetwork = new LibraryNetwork();

        // Створення абонентів для тестування
        libraryNetwork.addAbonent(1, new LibraryNetwork.Abonent("Авраменко", "Агата", "Петрівна", "Київ, вулиця Шевченка"));
        libraryNetwork.addAbonent(2, new LibraryNetwork.Abonent("Лисюк", "Марина", "Володимирівна", "Львів, вулиця Бандери"));
        libraryNetwork.addAbonent(3, new LibraryNetwork.Abonent("Лукаш", "Аліна", "Станіславівна", "Одеса, вулиця Дерибасівська"));
        libraryNetwork.addAbonent(4, new LibraryNetwork.Abonent("Журавський", "Тимур", "Миколайович", "Харків, вулиця Сумська"));
        libraryNetwork.addAbonent(5, new LibraryNetwork.Abonent("Заруба", "Єлизавета", "Юріївна", "Дніпро, вулиця Гагаріна"));
    }

    @Test
    void testAddAbonent() {
        LibraryNetwork.Abonent newAbonent = new LibraryNetwork.Abonent("Смирнов", "Іван", "Олександрович", "Полтава, вулиця Леніна");
        libraryNetwork.addAbonent(6, newAbonent);
        assertEquals(newAbonent, libraryNetwork.findAbonent(6));
    }

    @Test
    void testFindAbonent() {
        LibraryNetwork.Abonent abonent = libraryNetwork.findAbonent(3);
        assertNotNull(abonent);
        assertEquals("Лукаш", abonent.surname);
        assertEquals("Аліна", abonent.name);
        assertEquals("Станіславівна", abonent.patronymic);
        assertEquals("Одеса, вулиця Дерибасівська", abonent.address);
    }

    @Test
    void testUpdateAbonent() {
        LibraryNetwork.Abonent updatedAbonent = new LibraryNetwork.Abonent("Оновлене Прізвище", "Оновлене Ім'я", "Оновлене По Батькові", "Оновлена Адреса");
        libraryNetwork.updateAbonent(2, updatedAbonent);

        LibraryNetwork.Abonent abonent = libraryNetwork.findAbonent(2);
        assertNotNull(abonent);
        assertEquals("Оновлене Прізвище", abonent.surname);
        assertEquals("Оновлене Ім'я", abonent.name);
        assertEquals("Оновлене По Батькові", abonent.patronymic);
        assertEquals("Оновлена Адреса", abonent.address);
    }

    @Test
    void testGetSortedAbonents() {
        List<LibraryNetwork.Abonent> sortedAbonents = libraryNetwork.getSortedAbonents();
        assertEquals(5, sortedAbonents.size());

        // Перевірка, що список відсортовано за прізвищем
        assertTrue(sortedAbonents.get(0).surname.compareTo(sortedAbonents.get(1).surname) < 0);
        assertTrue(sortedAbonents.get(1).surname.compareTo(sortedAbonents.get(2).surname) < 0);
        assertTrue(sortedAbonents.get(2).surname.compareTo(sortedAbonents.get(3).surname) < 0);
        assertTrue(sortedAbonents.get(3).surname.compareTo(sortedAbonents.get(4).surname) < 0);
    }

    @Test
    void testFindAbonentNotFound() {
        LibraryNetwork.Abonent abonent = libraryNetwork.findAbonent(999);
        assertNull(abonent);
    }
}
