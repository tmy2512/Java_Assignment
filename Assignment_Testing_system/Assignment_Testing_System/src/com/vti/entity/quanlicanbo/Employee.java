package com.vti.entity.quanlicanbo;

public class Employee extends Officer {
    private String career;

    public Employee(String name, int age, Gender gender, String address, String career) {
        super(name, age, gender, address);
        this.career = career;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return "NhanVien{" + super.toString()+
                ", career='" + career + '\'' +
                '}';
    }
}
