package org.ironhack.bootcamp.jpt13.jpa.models;

import jakarta.persistence.Embeddable;

@Embeddable
public class EmergencyContact {
    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
