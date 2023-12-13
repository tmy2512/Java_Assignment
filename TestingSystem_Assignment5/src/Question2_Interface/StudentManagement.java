package Question2_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main implements ITuyenSinh{
    static Scanner sc= new Scanner(System.in);
    static List<Student> studentList = new ArrayList<>();
    @Override
    public void addStudent() {
        String codeStudent;
        String name;
        String address;
        int priority;
        String block;
        System.out.println("Nhap so bao danh: ");
        codeStudent = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        name = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        address = sc.nextLine();
        System.out.println("Nhap muc uu tien: ");
        priority = sc.nextInt();
        System.out.println("Chon khoi A-B-C: ");
        block = sc.next();
        Student student = new Student(codeStudent, name, address, priority, new Block(block));
        studentList.add(student);
    }

    @Override
    public void displayStudent() {

    }

    @Override
    public void searchStudent() {

    }
}
