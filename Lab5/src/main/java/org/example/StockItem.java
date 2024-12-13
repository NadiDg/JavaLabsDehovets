package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class StockItem implements StockItemOperations {
    private String productName;
    private String manufacturer;
    private int quantity;
    private LocalDate manufactureDate;
    private int deliveryTerm;
    private String supplier;
    private String supplierPhone;
    private String manufacturerPhone;
    private double pricePerUnit;

    public StockItem(String productName, String manufacturer, int quantity,
                     LocalDate manufactureDate, int deliveryTerm, String supplier,
                     String supplierPhone, String manufacturerPhone, double pricePerUnit) {
        setProductName(productName);
        setManufacturer(manufacturer);
        setQuantity(quantity);
        setManufactureDate(manufactureDate);
        setDeliveryTerm(deliveryTerm);
        setSupplier(supplier);
        setSupplierPhone(supplierPhone);
        setManufacturerPhone(manufacturerPhone);
        setPricePerUnit(pricePerUnit);
    }

    @Override
    public void setProductName(String productName) {
        if (productName == null || productName.trim().isEmpty()) {
            throw new IllegalArgumentException("Назва товару не може бути порожньою.");
        }
        this.productName = productName;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        if (manufacturer == null || manufacturer.trim().isEmpty()) {
            throw new IllegalArgumentException("Виробник не може бути порожнім.");
        }
        this.manufacturer = manufacturer;
    }

    @Override
    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Кількість не може бути від'ємною.");
        }
        this.quantity = quantity;
    }

    @Override
    public void setManufactureDate(LocalDate manufactureDate) {
        if (manufactureDate == null || manufactureDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Дата виготовлення не може бути в майбутньому.");
        }
        this.manufactureDate = manufactureDate;
    }

    @Override
    public void setDeliveryTerm(int deliveryTerm) {
        if (deliveryTerm <= 0) {
            throw new IllegalArgumentException("Термін поставки повинен бути позитивним.");
        }
        this.deliveryTerm = deliveryTerm;
    }

    @Override
    public void setSupplier(String supplier) {
        if (supplier == null || supplier.trim().isEmpty()) {
            throw new IllegalArgumentException("Постачальник не може бути порожнім.");
        }
        this.supplier = supplier;
    }

    @Override
    public void setSupplierPhone(String supplierPhone) {
        if (supplierPhone == null || supplierPhone.trim().isEmpty()) {
            throw new IllegalArgumentException("Телефон постачальника не може бути порожнім.");
        }
        this.supplierPhone = supplierPhone;
    }

    @Override
    public void setManufacturerPhone(String manufacturerPhone) {
        if (manufacturerPhone == null || manufacturerPhone.trim().isEmpty()) {
            throw new IllegalArgumentException("Телефон виробника не може бути порожнім.");
        }
        this.manufacturerPhone = manufacturerPhone;
    }

    @Override
    public void setPricePerUnit(double pricePerUnit) {
        if (pricePerUnit <= 0) {
            throw new IllegalArgumentException("Ціна за одиницю повинна бути позитивною.");
        }
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    @Override
    public int getDeliveryTerm() {
        return deliveryTerm;
    }

    @Override
    public String getSupplier() {
        return supplier;
    }

    @Override
    public String getSupplierPhone() {
        return supplierPhone;
    }

    @Override
    public String getManufacturerPhone() {
        return manufacturerPhone;
    }

    @Override
    public double getPricePerUnit() {
        return pricePerUnit;
    }

    @Override
    public double calculateTotalPrice() {
        return quantity * pricePerUnit;
    }

    @Override
    public String toString() {
        return String.format("Товар: %s, Виробник: %s, Кількість: %d, Ціна за одиницю: %.2f, Загальна ціна: %.2f",
                productName, manufacturer, quantity, pricePerUnit, calculateTotalPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockItem stockItem = (StockItem) o;
        return quantity == stockItem.quantity &&
                deliveryTerm == stockItem.deliveryTerm &&
                Double.compare(stockItem.pricePerUnit, pricePerUnit) == 0 &&
                productName.equals(stockItem.productName) &&
                manufacturer.equals(stockItem.manufacturer) &&
                manufactureDate.equals(stockItem.manufactureDate) &&
                supplier.equals(stockItem.supplier) &&
                supplierPhone.equals(stockItem.supplierPhone) &&
                manufacturerPhone.equals(stockItem.manufacturerPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, manufacturer, quantity, manufactureDate, deliveryTerm, supplier, supplierPhone, manufacturerPhone, pricePerUnit);
    }
}


