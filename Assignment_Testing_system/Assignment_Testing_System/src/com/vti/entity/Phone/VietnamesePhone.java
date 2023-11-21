package com.vti.entity.Phone;

import java.util.ArrayList;

public class VietnamesePhone extends Phone{

    public VietnamesePhone(Contact[] contacts) {
        super(contacts);
    }

    @Override
    public void insertContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
    }

    @Override
    public void removeContact(String name) {
        
    }

    @Override
    public void updateContact(String name, String phoneNumber) {

    }

    @Override
    public void searchContact(String name) {

    }
}
