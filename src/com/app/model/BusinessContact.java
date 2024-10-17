package com.app.model;

import com.app.enums.ContactType;

public class BusinessContact extends Contact{
    private String fax;

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public BusinessContact(String fax) {
        this.fax = fax;
    }

    public BusinessContact(String name, String phone) {
        super(name, phone, ContactType.BUSINESS);

    }

    @Override
    public String toString() {
        return  super.toString() +
                "fax='" + fax + '\'' ;
    }
}
