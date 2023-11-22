package com.vti.backend.Officer;

import com.vti.backend.Officer.IOfficer;
import com.vti.backend.Officer.OfficerManagement;
import com.vti.entity.quanlicanbo.Officer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    static List<Officer> officerList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice, tmp;
        while (true){
            System.out.println("Chon thao tac muon thuc hien: " +
                    "\n 1. Them can bo\n 2. Hien thi can bo\n 3. Tim kiem can bo\n 4. Xoa can bo");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 4) {
                switch (choice) {
                    case 1: IOfficer addCanBo = new OfficerManagement();
                    addCanBo.addCanBo();
                        break;
                    case 2: IOfficer display = new OfficerManagement();
                    display.displayOfficer();
                        break;
                    case 3: IOfficer search = new OfficerManagement();
                    search.searchOfficer();
                        break;
                    case 4: IOfficer delete = new OfficerManagement();
                        delete.deleteOfficer();
                        break;
                    default:
                        break;
                }
                System.out.println("Ban co muon tiep tuc? 0 - dung lai, 1 - tiep tuc");
                tmp = sc.nextInt();
                if (tmp == 0) {
                    return;
                }
                else {
                    System.out.println("Tiep tuc!");
                }
            }
        }
    }
}
