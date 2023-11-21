package com.vti.entity.Phone;

public abstract class Phone {
    private Contact[] contacts;

    public Phone(Contact[] contacts) {
        this.contacts = contacts;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }
    public abstract void insertContact(String name, String phoneNumber);
    public abstract void removeContact(String name);
    public abstract void updateContact(String name, String phoneNumber);
    public abstract void searchContact(String name);

}
