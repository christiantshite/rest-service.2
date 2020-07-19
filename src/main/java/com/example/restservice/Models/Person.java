package com.example.restservice.Models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Person {
    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    int id;
    String firstName;
    String lastName;
    LocalDate birthDate;
    Address address;

    public Person(int id, String firstName, String lastName, LocalDate birthDate, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
