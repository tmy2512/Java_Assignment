package Test1;

import Test1.Department;

public class Program {
    public static void main(String[] args) {
        Department department1 = new Department(1, "Sale");
        Department department2 = new Department(1, "Marketing");
        System.out.println("Thong tin cua phong ban 1:\n "+department1.getId() +"\n"+ department1.getName());
//        System.out.println("Ma phong ban 1 la: "+department1.getId()+", Ten phong ban: "+department1.getName());
        System.out.println("Ma phong ban 2 la: "+department2.getId()+", Ten phong ban: "+department2.getName());
    }
}
