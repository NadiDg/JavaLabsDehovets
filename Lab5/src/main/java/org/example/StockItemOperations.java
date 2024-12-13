package org.example;

import java.time.LocalDate;

public interface StockItemOperations {
    void setProductName(String productName);
    void setManufacturer(String manufacturer);
    void setQuantity(int quantity);
    void setManufactureDate(LocalDate manufactureDate);
    void setDeliveryTerm(int deliveryTerm);
    void setSupplier(String supplier);
    void setSupplierPhone(String supplierPhone);
    void setManufacturerPhone(String manufacturerPhone);
    void setPricePerUnit(double pricePerUnit);

    String getProductName();
    String getManufacturer();
    int getQuantity();
    LocalDate getManufactureDate();
    int getDeliveryTerm();
    String getSupplier();
    String getSupplierPhone();
    String getManufacturerPhone();
    double getPricePerUnit();

    double calculateTotalPrice();
}






