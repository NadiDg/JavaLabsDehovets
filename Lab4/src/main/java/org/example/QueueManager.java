package org.example;

import java.util.LinkedList;

public class QueueManager {

    public static class AddressValue {
        String city;
        String street;
        int houseNumber;
        int apartmentNumber;

        public AddressValue(String city, String street, int houseNumber, int apartmentNumber) {
            this.city = city;
            this.street = street;
            this.houseNumber = houseNumber;
            this.apartmentNumber = apartmentNumber;
        }

        @Override
        public String toString() {
            return city + ", " + street + ", " + houseNumber + (apartmentNumber != 0 ? ", кв. " + apartmentNumber : "");
        }
    }

    public static class QueuePerson {
        String surname;
        String name;
        String patronymic;
        AddressValue address;
        int priority;

        public QueuePerson(String surname, String name, String patronymic, AddressValue address, int priority) {
            this.surname = surname;
            this.name = name;
            this.patronymic = patronymic;
            this.address = address;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return surname + " " + name + " " + patronymic + " (Пріоритет: " + priority + "), Адреса: " + address;
        }
    }

    public LinkedList<QueuePerson> queue;

    public QueueManager() {
        queue = new LinkedList<>();
    }

    public void addPerson(QueuePerson person) {
        int insertIndex = 0;
        for (QueuePerson p : queue) {
            if (p.priority <= person.priority) {
                insertIndex++;
            } else {
                break;
            }
        }
        queue.add(insertIndex, person);
    }

    public void changePriority(String surname, int newPriority) {
        for (QueuePerson person : queue) {
            if (person.surname.equalsIgnoreCase(surname)) {
                queue.remove(person);
                person.priority = newPriority;
                addPerson(person);
                return;
            }
        }
        System.out.println("Особа з прізвищем " + surname + " не знайдена.");
    }

    public void displayQueue() {
        for (QueuePerson person : queue) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        QueueManager manager = new QueueManager();

        AddressValue address1 = new AddressValue("Київ", "Брайчевського", 3, 5);
        AddressValue address2 = new AddressValue("Львів", "Жулянська", 15, 0);
        AddressValue address3 = new AddressValue("Одеса", "Сагайдачного", 3, 8);
        AddressValue address4 = new AddressValue("Дніпро", "Заводська", 20, 12);
        AddressValue address5 = new AddressValue("Херсон", "Польова", 7, 0);

        manager.addPerson(new QueuePerson("Авраменко", "Агата", "Петрівна", address1, 3));
        manager.addPerson(new QueuePerson("Лисюк", "Марина", "Володимирівна", address2, 1));
        manager.addPerson(new QueuePerson("Лукаш", "Аліна", "Станіславівна", address3, 5));
        manager.addPerson(new QueuePerson("Журавський", "Тимур", "Миколайович", address4, 2));
        manager.addPerson(new QueuePerson("Заруба", "Єлизавета", "Юріївна", address5, 4));

        System.out.println("Ініціалізуємо чергу:");
        manager.displayQueue();

        System.out.println("\nЗміна пріоритету Авраменко до 6:");
        manager.changePriority("Авраменко", 6);

        System.out.println("\nОновлення черги:");
        manager.displayQueue();
    }
}










