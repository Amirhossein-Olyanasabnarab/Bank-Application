package com.bank.model;

import com.bank.enums.CustomerType;

public class LegalCustomer extends Customer {
    private String fax;
    public LegalCustomer(String name, String phoneNumber) {
        super(name, phoneNumber, CustomerType.LEGAL);
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return "LegalCustomer{" +
                super.toString() +
                " fax='" + fax + '\'' +
                '}';
    }
}
