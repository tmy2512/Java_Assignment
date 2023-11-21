package com.vti.entity.quanlithuvien;

import com.vti.entity.Date;

public class Newspaper extends Library{
    private Date launchedDate;

    public Newspaper(String code, String namePublisher, int launchedQuantity, Date launchedDate) {
        super(code, namePublisher, launchedQuantity);
        this.launchedDate = launchedDate;
    }

    public Date getLaunchedDate() {
        return launchedDate;
    }

    public void setLaunchedDate(Date launchedDate) {
        this.launchedDate = launchedDate;
    }
}
