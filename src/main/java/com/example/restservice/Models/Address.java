package com.example.restservice.Models;

public class Address {
    String Streetname;
    int number;
    String zipcode;
    String city;

    public Address(String streetname, int number, String zipcode, String city) {
        Streetname = streetname;
        this.number = number;
        this.zipcode = zipcode;
        this.city = city;
    }

    public String getStreetname() {
        return Streetname;
    }

    public void setStreetname(String streetname) {
        Streetname = streetname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
