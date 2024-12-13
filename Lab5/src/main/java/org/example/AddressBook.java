package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AddressBook extends Date {
    private String fullName;
    private String phoneNumber;
    private LocalDate birthDate;

    public AddressBook(String fullName, String phoneNumber, LocalDate birthDate, LocalDate currentDate) {
        super(currentDate);
        setFullName(fullName);
        setPhoneNumber(phoneNumber);
        setBirthDate(birthDate);
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new IllegalArgumentException("ПІБ не може бути порожнім.");
        }
        this.fullName = fullName;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Телефон не може бути порожнім.");
        }
        this.phoneNumber = phoneNumber;
    }

    public void setBirthDate(LocalDate birthDate) {
        if (birthDate == null || birthDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Дата народження не може бути в майбутньому.");
        }
        this.birthDate = birthDate;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public long calculateDaysUntilBirthday() {
        LocalDate currentDate = getDate();
        LocalDate nextBirthday = birthDate.withYear(currentDate.getYear());

        if (nextBirthday.isBefore(currentDate)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        return ChronoUnit.DAYS.between(currentDate, nextBirthday);
    }
}










