package com.vti.backend.Library;

import com.vti.entity.quanlithuvien.Book;
import com.vti.entity.quanlithuvien.Library;
import com.vti.entity.quanlithuvien.Magazine;
import com.vti.entity.quanlithuvien.Newspaper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class LibraryManagement implements ILibrary {
    static Scanner sc = new Scanner(System.in);
    static List<Library> libraryList = new ArrayList<>();


    @Override
    public void addDocument(){
        String code;
        String namePublisher;
        int launchedQuantity;
        String author, launchNumber;
        int pageNumber, choice, launchedMonth;
        Date launchedDate;
        System.out.println("Nhap so luong tai lieu muon them: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Chon loai tai lieu: " +
                    "\n1. Sach - 2. Bao - 3. Tap chi");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap ma code sach: ");
            code = sc.nextLine();
            System.out.println("Nhap ten nha phat hanh: ");
            namePublisher = sc.nextLine();
            System.out.println("Nhap so luong sach phat hanh: ");
            launchedQuantity = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhap ten tac gia: ");
                    author = sc.nextLine();
                    System.out.println("Nhap so trang sach: ");
                    pageNumber = sc.nextInt();
                    Library book = new Book(code, namePublisher, launchedQuantity, author, pageNumber);
                    libraryList.add(book);
                    break;
                case 2:
//                    try {
                        System.out.println("Nhap chuoi ngay(dd/MM/yyyy): ");
                        String stringDate = sc.nextLine();
//                        Library newspaper = new Newspaper(code, namePublisher, launchedQuantity, new SimpleDateFormat("dd/MM/yyyy").parse(stringDate)) ;
//                    } catch (ParseException p) {
//                        p.printStackTrace();
//                    }
                    break;
                case 3:
                    System.out.println("Nhap so phat hanh: ");
                    launchNumber = sc.nextLine();
                    System.out.println("Nhap thang phat hanh: ");
                    launchedMonth = sc.nextInt();
                    Library magazine = new Magazine(code, namePublisher, launchedQuantity, launchNumber, launchedMonth);
                    libraryList.add(magazine);
                    break;
            }
        }
    }

    @Override
    public void deleteDocument() {
        int tmp = 0, tmp2 = libraryList.size();
        System.out.println("Nhap ten tai lieu can xoa: ");
        String name = sc.nextLine();
        Iterator<Library> libraryIterator = libraryList.iterator();
        while (libraryIterator.hasNext()) {
            Library nextDocument = libraryIterator.next();
            if ((name).equals(nextDocument.getCode())) {
                System.out.println("Da tim thay ten can xoa va xoa!!");
                libraryIterator.remove();
            }
            else tmp++;
        }
        if (tmp == tmp2) System.out.println("Khong tim thay tai lieu muon xoa!!");
    }

    @Override
    public void displayDocument() {
        if (libraryList.size() == 0 ) System.out.println("Thu vien khong chua tai lieu nao!!");
        for (Library document:libraryList) {
            System.out.println(document.toString());
        }
    }

    @Override
    public void searchDocument() {
        int tmp=0;
        // tim kiem theo tai lieu: sach-bao-tapchi
        System.out.println("Chon loai tai lieu can tim kiem: " +
                "\n 1. Sach - 2. Bao - 3. Tap chi");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                for (Library document:libraryList) {
                    if (document.toString().contains("Book")) {
                        tmp++;
                        System.out.println(document.toString());
                    }
                }
                if (tmp == 0) System.out.println("Khong ton tai book nao trong list!!");
                break;
            case 2:
                for (Library document:libraryList) {
                    if (document.toString().contains("Newspaper")) {
                        tmp++;
                        System.out.println(document.toString());
                    }
                }
                if (tmp == 0) System.out.println("Khong ton tai newspaper nao trong list!!");
                break;
            case 3:
                for (Library document:libraryList) {
                    if (document.toString().contains("Magazine")) {
                        tmp++;
                        System.out.println(document.toString());
                    }
                }
                if (tmp == 0) System.out.println("Khong ton tai magazine nao trong list!!");
                break;
        }
    }
}
