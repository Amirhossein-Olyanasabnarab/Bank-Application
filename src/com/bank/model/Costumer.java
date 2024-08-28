package com.bank.model;

import com.bank.enums.CostumerType;

public abstract class Costumer {
    private String name;
    private String phoneNumber;
    private CostumerType type;

    public Costumer(String name, String phoneNumber, CostumerType type) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", type=" + type +
                '}';
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CostumerType getType() {
        return type;
    }
}
