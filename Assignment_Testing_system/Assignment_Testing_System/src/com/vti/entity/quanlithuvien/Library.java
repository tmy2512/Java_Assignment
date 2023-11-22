package com.vti.entity.quanlithuvien;

public class Library {
    private String code;
    private String namePublisher;
    private int launchedQuantity;

    public Library() {
    }

    public Library(String code, String namePublisher, int launchedQuantity) {
        this.code = code;
        this.namePublisher = namePublisher;
        this.launchedQuantity = launchedQuantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNamePublisher() {
        return namePublisher;
    }

    public void setNamePublisher(String namePublisher) {
        this.namePublisher = namePublisher;
    }

    public int getLaunchedQuantity() {
        return launchedQuantity;
    }

    public void setLaunchedQuantity(int launchedQuantity) {
        this.launchedQuantity = launchedQuantity;
    }

    @Override
    public String toString() {
        return
                "code='" + code + '\'' +
                ", namePublisher='" + namePublisher + '\'' +
                ", launchedQuantity=" + launchedQuantity +
                '}';
    }
}
