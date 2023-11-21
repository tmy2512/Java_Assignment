package com.vti.backend;

import com.vti.entity.quanlithuvien.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Book> listBook = new ArrayList<Book>();
     public static void addBook() {
         String code;
         String namePublisher;
         String launchedQuantity;
         String author;
         int pageNumber;
         System.out.println("Nhap so sach muon them: ");
         int n = sc.nextInt();
         sc.nextLine();
         for (int i = 0; i < n; i++) {
//             Book book = new Book(code, namePublisher, launchedQuantity, author, pageNumber);
         }
     }
    public static void main(String[] args) {

    }
}
