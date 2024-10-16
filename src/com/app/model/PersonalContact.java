package com.app.model;

import com.app.enums.ContactType;

public class PersonalContact extends Contact{
    private String family;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public PersonalContact(String family) {
        this.family = family;
    }

    public PersonalContact(String name, String phone) {
        super(name, phone, ContactType.PERSONAL);

    }
}
