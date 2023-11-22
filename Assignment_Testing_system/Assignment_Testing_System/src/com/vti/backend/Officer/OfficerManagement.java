package com.vti.backend.Officer;

import com.vti.backend.Officer.IOfficer;
import com.vti.entity.quanlicanbo.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OfficerManagement implements IOfficer {
    static  ArrayList<Engineer> listOfKiSus = new ArrayList<>();
    static ArrayList<Worker> lisOfWorkers = new ArrayList<Worker>();
    static ArrayList<Employee> lisOfEmployees = new ArrayList<Employee>();
    static List<Officer> officerList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    // them moi can bo voi params

    @Override
    public void addCanBo() {
        String name, address, career;
        int age, n, level;
        Gender gender;
        System.out.println("Nhap so can bo muon them: ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            // chon 1 2 3 de them nhan vien - cong nhan - ki su
            System.out.println("Chon loai can bo muon them\n" +
                    " 1.Ki su - 2.Cong nhan - 3.Nhan vien: ");
            int chon = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap ten: ");
            name = sc.nextLine();
            System.out.println("Nhap tuoi: ");
            age = sc.nextInt();
            sc.nextLine();
            System.out.println("Chon gioi tinh: 1.female - 2.male - 3.unknown. Chon 1, 2, 3");
            int gender_number= sc.nextInt();
            switch (gender_number) {
                case 1: gender = Gender.FEMALE;
                    break;
                case 2: gender = Gender.MALE;
                    break;
                default: gender = Gender.UNKNOWN;
                    break;
            }
            sc.nextLine();
            System.out.println("Nhap dia chi: ");
            address = sc.nextLine();
            switch (chon) {
                case 1:
                    System.out.println("Nhap chuyen nganh dao tao: ");
                    String major = sc.nextLine();
                    Engineer ks = new Engineer(name, age, gender, address, major);
                    officerList.add(ks);
                    break;
                case 2:
                    System.out.println("Nhap trinh do( 1-10): ");
                    level = sc.nextInt();
                    sc.nextLine();
                    Worker worker = new Worker(name, age, gender, address,level);
                    officerList.add(worker);
                    break;
                case 3:
                    System.out.println("Career: ");
                    career = sc.nextLine();
                    Employee employee = new Employee(name, age, gender, address, career);
                    officerList.add(employee);
                default:

                    break;
            }
        }
    }

    @Override
    public void displayOfficer() {
//        int choice;
//        System.out.println("Chon hinh thuc hien thi: " +
//                "\n1. Cong nhan - 2. Ki su - 3. Nhan vien - 4. All of them");
//        choice = sc.nextInt();
//        switch (choice) {
//            case 4:
                for (Officer officer: officerList) {
                    System.out.println(officer.toString());
                }
//                break;
//        }
    }

    @Override
    public void searchOfficer() {
        int tmp=0;
        System.out.println("Nhap ten can tim kiem: ");
        String foundName = sc.nextLine();
        for (Officer officer:officerList) {
            if (foundName.equals(officer.getName())) {
                System.out.println(officer.toString());
            }
            else tmp++;

        }
        if (tmp == officerList.size()) System.out.println("Khong ton tai can bo nay trong ds");
    }

    @Override
    public void deleteOfficer() {
        int tmp = 0;
        int tmp2 = officerList.size();
        System.out.println("Nhap ten can xoa: ");
        String deletedName = sc.nextLine();
        Iterator<Officer> officerIterator = officerList.iterator();
        while(officerIterator.hasNext()) {
            Officer nextOffice = officerIterator.next();
            if (nextOffice.getName().equals(deletedName)) {
                System.out.println("Da tim thay ki su can xoa!");
                officerIterator.remove();
            }
            else tmp++;
        }
        if (tmp == tmp2) System.out.println("Khong ton tai ten can bo can xoa");
    }



}
