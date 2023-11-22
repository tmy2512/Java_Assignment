package com.vti.entity.quanlithuvien;

public class Magazine extends Library{
    private String launchNumber;
    private int launchedmonth;

    public Magazine(String code, String namePublisher, int launchedQuantity, String launchNumber, int launchedmonth) {
        super(code, namePublisher, launchedQuantity);
        this.launchNumber = launchNumber;
        this.launchedmonth = launchedmonth;
    }

    public String getLaunchNumber() {
        return launchNumber;
    }

    public void setLaunchNumber(String launchNumber) {
        this.launchNumber = launchNumber;
    }

    public int getLaunchedmonth() {
        return launchedmonth;
    }

    public void setLaunchedmonth(int launchedmonth) {
        this.launchedmonth = launchedmonth;
    }

    @Override
    public String toString() {
        return "Magazine{" + super.toString()+
                ", launchNumber='" + launchNumber + '\'' +
                ", launchedmonth=" + launchedmonth +
                '}';
    }
}
