package com.bank.model;

import com.bank.enums.CustomerType;

public class RealCustomer extends Customer {
    private String family;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public RealCustomer(String name, String phoneNumber) {
        super(name, phoneNumber, CustomerType.REAL);
    }
}
