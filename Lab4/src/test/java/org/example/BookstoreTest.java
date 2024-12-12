package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookstoreTest {

    private Bookstore bookstore;

    @BeforeEach
    public void setUp() {
        bookstore = new Bookstore();
        bookstore.addBook(123456789, new Bookstore.Book("Кобзар", "Тарас Шевченко", "Державне видавництво", 1840, 150.0f));
        bookstore.addBook(987654321, new Bookstore.Book("Мартин Боруля", "Іван Карпенко-Карий", "Українське видавництво", 1886, 120.0f));
        bookstore.addBook(515161925, new Bookstore.Book("Записки українського самашедшого", "Ліна Костенко", "Літературне видавництво", 1978, 200.0f));
        bookstore.addBook(728817822, new Bookstore.Book("Гаррі Поттер і філософський камінь", "Дж. К. Роулінг", "Петро", 1997, 250.0f));
        bookstore.addBook(198952525, new Bookstore.Book("Людина і зброя", "Олександр Довженко", "Українська книга", 1943, 180.0f));
    }

    @Test
    public void testAddBook() {
        Bookstore.Book book = bookstore.findBook(123456789);
        assertNotNull(book);
        assertEquals("Кобзар", book.title);
        assertEquals("Тарас Шевченко", book.author);
    }

    @Test
    public void testFindBook() {
        Bookstore.Book book = bookstore.findBook(987654321);
        assertNotNull(book);
        assertEquals("Мартин Боруля", book.title);
    }

    @Test
    public void testUpdatePrice() {
        bookstore.updatePrice(123456789, 170.0f);
        Bookstore.Book book = bookstore.findBook(123456789);
        assertEquals(170.0f, book.price);
    }

    @Test
    public void testSortedBooksByPrice() {
        List<Bookstore.Book> sortedBooks = bookstore.getSortedBooksByPrice();
        assertEquals(120.0f, sortedBooks.get(0).price);
        assertEquals(250.0f, sortedBooks.get(4).price);
    }

    @Test
    public void testBookNotFound() {
        Bookstore.Book book = bookstore.findBook(111111111);
        assertNull(book);
    }
}