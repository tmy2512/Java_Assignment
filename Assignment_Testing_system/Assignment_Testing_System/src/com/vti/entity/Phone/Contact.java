package com.vti.entity.Phone;

public  class Contact {
    private String phoneNumber;
    private String name;

    public Contact() {
    }

    public Contact(String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public abstract void insertContact(String name, String phoneNumber);
//    public abstract void removeContact(String name);
//    public abstract void updateContact(String name, String phoneNumber);
//    public abstract void searchContact(String name);

}
