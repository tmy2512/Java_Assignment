package com.vti.entity.quanlithuvien;

public class Book extends Library{
    private String author;
    private int pageNumber;



    public Book(String code, String namePublisher, int launchedQuantity, String author, int pageNumber) {
        super(code, namePublisher, launchedQuantity);
        this.author = author;
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "Book{" + super.toString()+
                ", author='" + author + '\'' +
                ", pageNumber=" + pageNumber +
                '}';
    }
}
