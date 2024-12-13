package org.example;

import java.time.LocalDate;

class Date implements DateOperations {
    private LocalDate date;

    public Date(LocalDate date) {
        setDate(date);
    }

    public void setDate(LocalDate date) {
        if (date == null) {
            throw new IllegalArgumentException("Дата не може бути порожньою.");
        }
        this.date = date;
    }

    @Override
    public LocalDate getDate() {
        return this.date;
    }
}


