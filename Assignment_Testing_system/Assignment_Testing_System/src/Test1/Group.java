package Test1;

import Test1.Account;

import java.util.Date;

public class Group {
    private int id;
    private String name;
    private Date createDate;
    private Account[] accounts;
    public Group() {}

    public Group(int id, String name, Date createDate, Account[] accounts) {
        this.id = id;
        this.name = name;
        this.createDate = createDate;
        this.accounts = accounts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }



}
