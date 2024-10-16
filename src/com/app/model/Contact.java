package com.app.model;

import com.app.enums.ContactType;

public abstract class Contact {
    private String name;
    private String phone;
    private ContactType contactType;

    public Contact() {
    }

    public Contact(String name, String phone, ContactType contactType) {
        this.name = name;
        this.phone = phone;
        this.contactType = contactType;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + phone + '\'' +
                ", type=" + contactType +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = capitalizeFirstLetter(name);
    }

    public ContactType getContactType() {
        return contactType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    private String capitalizeFirstLetter(String str) {
        if(str != null && !str.isEmpty()){
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;    }
}
