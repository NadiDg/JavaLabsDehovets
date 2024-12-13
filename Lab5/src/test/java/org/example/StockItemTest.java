package org.example;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StockItemTest {

    @Test
    public void testStockItemConstructorAndGetters() {
        // Створення об'єкта StockItem
        StockItem item = new StockItem(
                "Laptop",
                "Dell",
                50,
                LocalDate.of(2023, 10, 1),
                14,
                "TechSupply",
                "+123456789",
                "+987654321",
                1200.00
        );

        // Перевірка значень полів
        assertEquals("Laptop", item.getProductName());
        assertEquals("Dell", item.getManufacturer());
        assertEquals(50, item.getQuantity());
        assertEquals(LocalDate.of(2023, 10, 1), item.getManufactureDate());
        assertEquals(14, item.getDeliveryTerm());
        assertEquals("TechSupply", item.getSupplier());
        assertEquals("+123456789", item.getSupplierPhone());
        assertEquals("+987654321", item.getManufacturerPhone());
        assertEquals(1200.00, item.getPricePerUnit(), 0.01);
    }

    @Test
    public void testCalculateTotalPrice() {
        StockItem item = new StockItem(
                "Laptop",
                "Dell",
                50,
                LocalDate.of(2023, 10, 1),
                14,
                "TechSupply",
                "+123456789",
                "+987654321",
                1200.00
        );

        // Перевірка розрахунку загальної ціни
        assertEquals(60000.00, item.calculateTotalPrice(), 0.01);
    }

    @Test
    public void testSetQuantity() {
        StockItem item = new StockItem(
                "Laptop",
                "Dell",
                50,
                LocalDate.of(2023, 10, 1),
                14,
                "TechSupply",
                "+123456789",
                "+987654321",
                1200.00
        );

        item.setQuantity(75);
        assertEquals(75, item.getQuantity());

        assertEquals(90000.00, item.calculateTotalPrice(), 0.01);
    }

    @Test
    public void testInvalidProductName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new StockItem("", "Dell", 50, LocalDate.of(2023, 10, 1), 14, "TechSupply", "+123456789", "+987654321", 1200.00);
        });
    }

    @Test
    public void testInvalidQuantity() {
        assertThrows(IllegalArgumentException.class, () -> {
            new StockItem("Laptop", "Dell", -10, LocalDate.of(2023, 10, 1), 14, "TechSupply", "+123456789", "+987654321", 1200.00);
        });
    }

    @Test
    public void testInvalidManufactureDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            new StockItem("Laptop", "Dell", 50, LocalDate.of(2025, 10, 1), 14, "TechSupply", "+123456789", "+987654321", 1200.00);
        });
    }

    @Test
    public void testInvalidPricePerUnit() {
        assertThrows(IllegalArgumentException.class, () -> {
            new StockItem("Laptop", "Dell", 50, LocalDate.of(2023, 10, 1), 14, "TechSupply", "+123456789", "+987654321", -1200.00);
        });
    }
}




