package com.vti.entity.quanliuser;

public class Management extends User{


    public Management(String name, double salaryRatio) {
        super(name, salaryRatio);
    }

    @Override
    public Double calculatePay() {
        return super.getSalaryRatio()*520;
    }
    @Override
    public void displayInfor() {
        System.out.println("Management= {"
                +super.toString()+
                ", calculatePay= "+calculatePay()+"}");
    }
}
