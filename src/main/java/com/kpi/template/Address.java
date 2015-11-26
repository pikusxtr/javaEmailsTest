package com.kpi.template;

/**
 * Created by SG0213064 on 3/3/2015.
 */
public class Address {
    String streetName;
    String streetNo;
    String City;
    String zipCode;

    public Address(String streetName, String streetNo, String city, String zipCode) {
        this.streetName = streetName;
        this.streetNo = streetNo;
        City = city;
        this.zipCode = zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
