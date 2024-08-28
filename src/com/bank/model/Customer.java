package com.bank.model;

import com.bank.enums.CustomerType;

public abstract class Customer {
    private String name;
    private String phoneNumber;
    private CustomerType type;

    public Customer(String name, String phoneNumber, CustomerType type) {
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

    public CustomerType getType() {
        return type;
    }
}
