package com.app.model;

import com.app.enums.ContactType;

public class BusinessContact extends Contact{
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BusinessContact(String email) {
        this.email = email;
    }

    public BusinessContact(String name, String phone) {
        super(name, phone, ContactType.BUSINESS);

    }
}
