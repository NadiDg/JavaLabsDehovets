package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class QueueManagerTest {

    private QueueManager manager;

    @BeforeEach
    public void setUp() {
        manager = new QueueManager();

        // Створення адрес
        QueueManager.AddressValue address1 = new QueueManager.AddressValue("Київ", "Брайчевського", 3, 5);
        QueueManager.AddressValue address2 = new QueueManager.AddressValue("Львів", "Жулянська", 15, 0);
        QueueManager.AddressValue address3 = new QueueManager.AddressValue("Одеса", "Сагайдачного", 3, 8);
        QueueManager.AddressValue address4 = new QueueManager.AddressValue("Дніпро", "Заводська", 20, 12);
        QueueManager.AddressValue address5 = new QueueManager.AddressValue("Херсон", "Польова", 7, 0);

        // Додавання черговиків
        manager.addPerson(new QueueManager.QueuePerson("Авраменко", "Агата", "Петрівна", address1, 3));
        manager.addPerson(new QueueManager.QueuePerson("Лисюк", "Марина", "Володимирівна", address2, 1));
        manager.addPerson(new QueueManager.QueuePerson("Лукаш", "Аліна", "Станіславівна", address3, 5));
        manager.addPerson(new QueueManager.QueuePerson("Журавський", "Тимур", "Миколайович", address4, 2));
        manager.addPerson(new QueueManager.QueuePerson("Заруба", "Єлизавета", "Юріївна", address5, 4));
    }

    @Test
    public void testAddPerson() {
        List<QueueManager.QueuePerson> queue = manager.queue;

        assertEquals(5, queue.size());

        assertEquals("Лисюк", queue.get(0).surname);
        assertEquals("Журавський", queue.get(1).surname);
        assertEquals("Авраменко", queue.get(2).surname);
        assertEquals("Заруба", queue.get(3).surname);
        assertEquals("Лукаш", queue.get(4).surname);
    }

    @Test
    public void testChangePriority() {
        manager.changePriority("Авраменко", 6);

        List<QueueManager.QueuePerson> queue = manager.queue;

        assertEquals("Авраменко", queue.get(4).surname);
    }

    @Test
    public void testChangePriorityNonExistentPerson() {
        manager.changePriority("Невідомий", 10);

        assertEquals(5, manager.queue.size());
    }
}