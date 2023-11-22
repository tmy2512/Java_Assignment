package com.vti.backend.Library;

import java.util.Scanner;

public class Program {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("Nhap thao tac muon thuc hien: " +
                    "\n 1. Them tai lieu " +
                    "\n 2. Hien thi tai lieu " +
                    "\n 3. Tim kiem tai lieu theo ten " +
                    "\n 4. Xoa tai lieu theo ten");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 4) {
                switch (choice) {
                    case 1: ILibrary addDocument = new LibraryManagement();
                    addDocument.addDocument();
                        break;
                    case 2: ILibrary display = new LibraryManagement();
                    display.displayDocument();
                        break;
                    case 3: ILibrary search = new LibraryManagement();
                            search.searchDocument();
                        break;
                    case 4: ILibrary delete = new LibraryManagement();
                            delete.deleteDocument();
                        break;
                }
                System.out.println("Ban co muon tiep tuc? 0 - dung lai, 1 - tiep tuc");
                int tmp = sc.nextInt();
                sc.nextLine();
                if (tmp == 0)
                    break;
                else System.out.println("Tiep tuc!");
            }
        }
    }
}
