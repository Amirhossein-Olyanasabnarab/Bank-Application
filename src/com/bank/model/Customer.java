package com.bank.model;

import com.bank.enums.CustomerType;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Customer {
    private static final AtomicInteger ID_COUNTER = new AtomicInteger(1);
    private Integer id;
    private String name;
    private String phoneNumber;
    private CustomerType type;
    private Boolean deleted;

    public Customer(String name, String phoneNumber, CustomerType type) {
        this.id = ID_COUNTER.getAndIncrement();
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = type;
        this.deleted = false;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Integer getId() {
        return id;
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
        return
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", type=" + type ;

    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CustomerType getType() {
        return type;
    }
}
