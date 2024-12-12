package org.example;
import java.util.*;

public class LibraryNetwork {

    public static class Abonent {
        String surname;
        String name;
        String patronymic;
        String address;

        public Abonent(String surname, String name, String patronymic, String address) {
            this.surname = surname;
            this.name = name;
            this.patronymic = patronymic;
            this.address = address;
        }

        @Override
        public String toString() {
            return surname + " " + name + " " + patronymic + ", Адреса: " + address;
        }
    }

    private HashMap<Integer, Abonent> abonents;

    public LibraryNetwork() {
        abonents = new HashMap<>();
    }

    public void addAbonent(Integer abonentNumber, Abonent abonent) {
        abonents.put(abonentNumber, abonent);
    }

    public Abonent findAbonent(Integer abonentNumber) {
        return abonents.get(abonentNumber);
    }

    public void updateAbonent(Integer abonentNumber, Abonent updatedAbonent) {
        if (abonents.containsKey(abonentNumber)) {
            abonents.put(abonentNumber, updatedAbonent);
        } else {
            System.out.println("Абонента з номером " + abonentNumber + " не знайдено.");
        }
    }

    public List<Abonent> getSortedAbonents() {
        List<Abonent> sortedList = new ArrayList<>(abonents.values());
        sortedList.sort(Comparator.comparing(a -> a.surname));
        return sortedList;
    }

    public void displayAbonents() {
        abonents.forEach((number, abonent) -> {
            System.out.println("Номер: " + number + " -> " + abonent);
        });
    }

    public static void main(String[] args) {
        LibraryNetwork libraryNetwork = new LibraryNetwork();

        libraryNetwork.addAbonent(1, new Abonent("Авраменко", "Агата", "Петрівна", "Київ, вулиця Шевченка"));
        libraryNetwork.addAbonent(2, new Abonent("Лисюк", "Марина", "Володимирівна", "Львів, вулиця Бандери"));
        libraryNetwork.addAbonent(3, new Abonent("Лукаш", "Аліна", "Станіславівна", "Одеса, вулиця Дерибасівська"));
        libraryNetwork.addAbonent(4, new Abonent("Журавський", "Тимур", "Миколайович", "Харків, вулиця Сумська"));
        libraryNetwork.addAbonent(5, new Abonent("Заруба", "Єлизавета", "Юріївна", "Дніпро, вулиця Гагаріна"));

        System.out.println("Початковий список абонентів:");
        libraryNetwork.displayAbonents();

        System.out.println("\nВідсортований список абонентів за прізвищем:");
        List<Abonent> sortedAbonents = libraryNetwork.getSortedAbonents();
        sortedAbonents.forEach(System.out::println);

        System.out.println("\nОновлення абонента з номером 3:");
        libraryNetwork.updateAbonent(3, new Abonent("Оновлене Прізвище", "Оновлене Ім'я", "Оновлене По Батькові", "Оновлена Адреса"));
        libraryNetwork.displayAbonents();

        System.out.println("\nПошук абонента з номером 4:");
        Abonent foundAbonent = libraryNetwork.findAbonent(4);
        System.out.println(foundAbonent != null ? foundAbonent : "Абонента не знайдено.");
    }
}









