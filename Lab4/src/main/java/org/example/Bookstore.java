package org.example;

import java.util.*;

public class Bookstore {

    public static class Book {
        String title;
        String author;
        String publisher;
        int year;
        float price;

        public Book(String title, String author, String publisher, int year, float price) {
            this.title = title;
            this.author = author;
            this.publisher = publisher;
            this.year = year;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Назва: " + title + ", Автор: " + author + ", Видавництво: " + publisher + ", Рік видання: " + year + ", Ціна: " + price + " грн.";
        }
    }

    private HashMap<Integer, Book> books;

    public Bookstore() {
        books = new HashMap<>();
    }

    public void addBook(Integer isbn, Book book) {
        books.put(isbn, book);
    }

    public Book findBook(Integer isbn) {
        return books.get(isbn);
    }

    public void updatePrice(Integer isbn, float newPrice) {
        if (books.containsKey(isbn)) {
            Book book = books.get(isbn);
            book.price = newPrice;
        } else {
            System.out.println("Книга з ISBN " + isbn + " не знайдена.");
        }
    }

    public List<Book> getSortedBooksByPublisher() {
        List<Book> sortedList = new ArrayList<>(books.values());
        sortedList.sort(Comparator.comparing(book -> book.publisher));
        return sortedList;
    }

    public List<Book> getSortedBooksByPrice() {
        List<Book> sortedList = new ArrayList<>(books.values());
        sortedList.sort(Comparator.comparingDouble(book -> book.price));
        return sortedList;
    }

    public void displayBooks() {
        books.forEach((isbn, book) -> {
            System.out.println("ISBN: " + isbn + " -> " + book);
        });
    }

    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();

        // Створення книг (з українськими авторами)
        bookstore.addBook(123456789, new Book("Кобзар", "Тарас Шевченко", "Державне видавництво", 1840, 150.0f));
        bookstore.addBook(987654321, new Book("Мартин Боруля", "Іван Карпенко-Карий", "Українське видавництво", 1886, 120.0f));
        bookstore.addBook(515161925, new Book("Записки українського самашедшого", "Ліна Костенко", "Літературне видавництво", 1978, 200.0f));
        bookstore.addBook(728817822, new Book("Гаррі Поттер і філософський камінь", "Дж. К. Роулінг", "Петро", 1997, 250.0f));  // Гаррі Поттер (як приклад)
        bookstore.addBook(198952525, new Book("Людина і зброя", "Олександр Довженко", "Українська книга", 1943, 180.0f));

        System.out.println("Початковий список книг:");
        bookstore.displayBooks();

        System.out.println("\nВідсортований список книг за видавництвом:");
        List<Book> sortedByPublisher = bookstore.getSortedBooksByPublisher();
        sortedByPublisher.forEach(System.out::println);

        System.out.println("\nВідсортований список книг за ціною:");
        List<Book> sortedByPrice = bookstore.getSortedBooksByPrice();
        sortedByPrice.forEach(System.out::println);

        System.out.println("\nОновлення ціни книги з ISBN 123456789:");
        bookstore.updatePrice(123456789, 170.0f);
        bookstore.displayBooks();

        System.out.println("\nЗнайдено книгу за ISBN 987654321:");
        Book foundBook = bookstore.findBook(987654321);
        System.out.println(foundBook != null ? foundBook : "Книга не знайдена.");
    }
}





