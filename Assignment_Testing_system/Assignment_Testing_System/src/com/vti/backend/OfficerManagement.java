package com.vti.backend;

import com.sun.corba.se.spi.orbutil.threadpool.Work;
import com.vti.entity.quanlicanbo.Employee;
import com.vti.entity.quanlicanbo.Gender;
import com.vti.entity.quanlicanbo.Engineer;
import com.vti.entity.quanlicanbo.Worker;
import com.vti.frontend.MethodsOfEmployee;
import com.vti.frontend.MethodsOfEngineer;
import com.vti.frontend.MethodsOfWorker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OfficerManagement implements MethodsOfEmployee, MethodsOfWorker, MethodsOfEngineer {
    static  ArrayList<Engineer> listOfKiSus = new ArrayList<>();
    static ArrayList<Worker> lisOfWorkers = new ArrayList<Worker>();
    static ArrayList<Employee> lisOfEmployees = new ArrayList<Employee>();
//    static  List<KySu> listOfKiSus = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    // them moi can bo voi params

    public static void addKySu() {
        String name;
        int age;
        Gender gender;
        String address;
        String major;
//        ArrayList<KySu> listOfKiSus = new ArrayList<>();
        int n;
        System.out.println("Nhap so ki su muon them: ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
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
            System.out.println("Nhap chuyen nganh dao tao: ");
            major = sc.nextLine();
            Engineer ks = new Engineer(name, age, gender, address, major);
//            kiSuList.add(ks);
            listOfKiSus.add(ks);
        }
    }
    public static void displayKiSu() {
        if (listOfKiSus.size() == 0) {
            System.out.println("Chua ton tai ki su nao!");
        }
        else {
            for (Engineer k : listOfKiSus) {
                System.out.println(k.toString());
            }
        }

    }
    public static void searchName() {
        sc.nextLine();
        System.out.println("Nhap ten can tim kiem: ");
        String foundName = sc.nextLine();
        for (Engineer k:listOfKiSus) {
            if (foundName.equals(k.getName())) {
                System.out.println(k.toString());
            }

        }
    }
    public static void deleteAsName() {
        sc.nextLine();
        System.out.println("Nhap ten can xoa: ");
        String deletedName = sc.nextLine();
        Iterator<Engineer> kisuIterator = listOfKiSus.iterator();
        while(kisuIterator.hasNext()) {
            Engineer nextKySu = kisuIterator.next();
            if (nextKySu.getName().equals(deletedName)) {
                System.out.println("Da tim thay ki su can xoa!");
                kisuIterator.remove();
            }
//                            System.out.println(nextKySu);
        }
//                        for (KySu k: listOfKiSus) {
//                            if (k.getName().equals(deletedName)) {
//                                listOfKiSus.remove(k);
//                            }
//                        }

    }

    // thao tac voi object cong nhan
    public static void addWorker() {
        String name;
        int age;
        Gender gender;
        String address;
        int level;
        int numberGender;
        System.out.println("Nhap so cong nhan muon them vao: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ten: ");
            name = sc.nextLine();
            System.out.println("Nhap tuoi: ");age = sc.nextInt();
            System.out.println("Chon gioi tinh(1-2-3)\n 1. Female\n 2. Male\n 3.Unknown");
            numberGender = sc.nextInt();
            switch (numberGender) {
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
            System.out.println("Nhap trinh do( 1-10): ");
            level = sc.nextInt();
            sc.nextLine();
            Worker worker = new Worker(name, age, gender, address,level);
            lisOfWorkers.add(worker);
        }
    }
    public static void displayWorker() {
        if (lisOfWorkers.size() == 0) System.out.println("Khong ton tai cong nhan nao!");
        for (Worker worker : lisOfWorkers) {
            System.out.println(worker.toString());
        }
    }

    public static void searchWorker() {
        sc.nextLine();
        System.out.println("Input name's worker which searching: ");
        String name = sc.nextLine();
        for (Worker worker:lisOfWorkers) {
            if (worker.getName().equals(name)) {
                System.out.println(worker.toString());
            }
        }
    }

    public static void deleteWorker() {
        sc.nextLine();
        System.out.println("Input deleted name's worker : ");
        String name = sc.nextLine();
        Iterator<Worker> workerIterator = lisOfWorkers.iterator();
        while (workerIterator.hasNext()) {
            Worker nextWorker = workerIterator.next();
            if (nextWorker.getName().equals(name)) {
                workerIterator.remove();
            }
        }
    }

    public static void addEmployee() {
        String name;
        int age;
        Gender gender;
        String address;
        String career;
        int numberGender;
        System.out.println("Input quantity of employee: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Name: ");
            name = sc.nextLine();
            System.out.println("Age: ");age = sc.nextInt();
            System.out.println("Choose gender(1-2-3)\n 1. Female\n 2. Male\n 3.Unknown");
            numberGender = sc.nextInt();
            switch (numberGender) {
                case 1: gender = Gender.FEMALE;
                    break;
                case 2: gender = Gender.MALE;
                    break;
                default: gender = Gender.UNKNOWN;
                    break;
            }
            sc.nextLine();
            System.out.println("Address: ");
            address = sc.nextLine();
            System.out.println("Career: ");
            career = sc.nextLine();
            Employee employee = new Employee(name, age, gender, address, career);
            lisOfEmployees.add(employee);
        }
    }

    public static void displayEmployee() {
        if (lisOfEmployees.size() == 0) System.out.println("Not exist any employees");
        for (Employee employee:lisOfEmployees) {
            System.out.println(employee.toString());
        }
    }

    public static void searchEmployee() {
        int tmp=0;
        sc.nextLine();
        System.out.println("Input name's employee which searching: ");
        String name = sc.nextLine();
        for (Employee employee:lisOfEmployees) {
            if (employee.getName().equals(name)) {
                System.out.println(employee.toString());
            }
            else tmp++;
        }
        if (tmp == lisOfEmployees.size())
            System.out.println("Not exist searching employee");
    }

    public static void deleteEmployee() {
        int tmp=0;
        sc.nextLine();
        System.out.println("Input deleted name's employee: ");
        String name = sc.nextLine();
        Iterator<Employee> employeeIterator = lisOfEmployees.listIterator();
        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            if (employee.getName().equals(name)) {
                employeeIterator.remove();
            }
            else tmp++;
        }
        if(tmp == lisOfEmployees.size())
            System.out.println("Not exist this employee");
    }
    public static void main(String[] args) {
       int choice;
       int number;
        while (true) {
            System.out.println("Chon doi tuong muon thao tac: ");
            System.out.println("1.Ki su\n 2.Cong nhan\n 3.Nhan vien\n");
            int object = sc.nextInt();
            if(object >= 1&& object <= 3) {
                switch (object) {
                    case 1:
                        while (true) {
                            System.out.println("===== Ki su ======");
                            System.out.println("Nhap lua chon: "); choice = sc.nextInt();
                            if (choice >= 1 && choice <= 4) {
                                switch (choice){
                                    case 1:
                                        addKySu();
                                        break;
                                    case 2:
                                        displayKiSu();
                                        break;
                                    case 3:
                                        searchName();
                                        break;
                                    case 4:
                                        deleteAsName();
                                        break;
                                    default:
                                        break;
                                }
                                System.out.println("Ban co muon tiep tuc thao tac tren object nay khong. Chon 0 de thoat");
                                number = sc.nextInt();
                                if (number == 0) {
                                    break;
                                }
                                else {System.out.println("Nhap lai");}
                            }
                        }

                        break;
                    case 2: // xu li cong nhan
                        while (true) {
                            System.out.println("====== Cong nhan ======");
                            System.out.println("Nhap lua chon: "); choice = sc.nextInt();
                            if (choice >= 1 && choice <= 4) {
                                switch (choice) {
                                    case 1: addWorker();
                                        break;
                                    case 2: displayWorker();
                                        break;
                                    case 3: searchWorker();
                                        break;
                                    case 4: deleteWorker();
                                        break;
                                    default:
                                        break;
                                }
                                System.out.println("Ban co muon tiep tuc thao tac voi object? 0 - dung lai, 1 - tiep tuc");
                            number = sc.nextInt();
                            if(number == 0) {
                                break;
                            }
                            else System.out.println("Nhap lai!");
                            }
                        }

                        break;
                    case 3: // xu li nhan vien
                        while (true) {
                            System.out.println("===== Nhan vien =====");
                            System.out.println("Input choice: ");
                            choice = sc.nextInt();
                            if (choice >= 1 && choice <= 4) {
                                switch (choice) {
                                    case 1: addEmployee();
                                        break;
                                    case 2: displayEmployee();
                                        break;
                                    case 3: searchEmployee();
                                        break;
                                    case 4: deleteEmployee();
                                        break;
                                }
                                System.out.println("Continue???. 0 - stop, 1- continue");
                                number = sc.nextInt();
                                if (number == 0) break;
                                else System.out.println("Input again!!");
                            }
                        }
                        break;
                }

                System.out.println("Ban co muon tiep tuc? Chon 0 de dung lai");
                int tmp = sc.nextInt();
                if (tmp == 0) {
                    return;
                }
                else {
                    System.out.println("Input again!!");
                }

             }

        }

    }
}
