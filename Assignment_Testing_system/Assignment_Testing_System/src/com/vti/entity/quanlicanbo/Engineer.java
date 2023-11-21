package com.vti.entity.quanlicanbo;

public class Engineer extends Officer {
    private String major;

    public Engineer(String name, int age, Gender gender, String address, String major) {
        super(name, age, gender, address);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "KySu{" + super.toString()+
                ", major='" + major + '\'' +
                '}';
    }
}
