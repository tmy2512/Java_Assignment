package com.vti.entity.quanliuser;

public class Employee extends User{

    public Employee(String name, double salaryRatio) {
        super(name, salaryRatio);
    }

    @Override
    public Double calculatePay() {
        return getSalaryRatio()*420;
    }
    @Override
    public void displayInfor() {
        System.out.println("Employee= {"
                +super.toString()+
                ", calculatePay= "+calculatePay()+"}");
    }
}
