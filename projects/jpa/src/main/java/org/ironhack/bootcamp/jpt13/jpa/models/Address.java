package org.ironhack.bootcamp.jpt13.jpa.models;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String streetAddress;
    private String city;
    private String postalCode;

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
