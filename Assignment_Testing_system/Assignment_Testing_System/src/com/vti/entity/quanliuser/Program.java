package com.vti.entity.quanliuser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    static List<User> userList = new ArrayList<>();
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap ten employee: ");
        String name = sc.nextLine();
        System.out.println("Nhap salary ratio: ");
        double salaryRatio = sc.nextDouble();
        User user = new Employee(name, salaryRatio);
        userList.add(user);
        user.displayInfor();

    }
}
