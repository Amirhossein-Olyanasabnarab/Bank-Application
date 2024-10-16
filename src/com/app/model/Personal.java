package com.app.model;

import com.app.enums.ContactType;

public class Personal  extends Contact{
    private String family;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Personal(String family) {
        this.family = family;
    }

    public Personal(String name, String phone,  String family) {
        super(name, phone, ContactType.PERSONAL);
        this.family = family;
    }
}
