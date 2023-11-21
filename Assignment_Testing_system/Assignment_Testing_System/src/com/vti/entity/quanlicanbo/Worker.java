package com.vti.entity.quanlicanbo;

public class Worker extends Officer {
    private int level;

    public Worker(String name, int age, Gender gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "CongNhan{" + super.toString()+
                ", level=" + level +
                '}';
    }
}
