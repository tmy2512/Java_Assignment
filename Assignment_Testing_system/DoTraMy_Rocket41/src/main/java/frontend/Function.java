package frontend;

import backend.Controller.Controller;
import entity.Employee;
import entity.Manager;
import utils.ScannerUtils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Function {
    Controller controller = new Controller();
    List<Employee> listE = new ArrayList<>();
    List<Manager> listM = new ArrayList<>();

    public void getListEByid() throws SQLException, IOException {
        int  projectId;
        System.out.println("Nhap projectId: ");
        projectId = ScannerUtils.inputInt();
        listE = controller.getListEById(projectId);
        System.out.println("ID  Fullname    Email               Role");
        if (listE.size() == 0) {
            System.out.println("KHong co employee nao!");
        }
        else  {
            for (Employee e:listE) {
                System.out.println(e.listTable());
            }
        }

    }
    public void getListMByid() throws SQLException, IOException {
        int  projectId;
        System.out.println("Nhap projectId: ");
        projectId = ScannerUtils.inputInt();
        listM = controller.getListMById(projectId);
        System.out.println("ID  Fullname    Email               Role");
        if (listM.size() == 0) {
            System.out.println("KHong co manager nao!");
        }
        else  {
            for (Manager m:listM) {
                System.out.println(m.listTable());
            }
        }

    }
    public void loginManager() throws SQLException, IOException {
        while (true) {
            System.out.println("Nhap email: ");
            String email = ScannerUtils.inputEmail();
            System.out.println("Nhap password: ");
            String password= ScannerUtils.inputPassword();
            listM = controller.loginManager(email, password);
            if (listM.size() == 0) {
                System.out.println("Dang nhap khong thanh cong. kiem tra lai email/password");
                System.out.println("Ban co phai manager khong?");
            } else  {
                System.out.println("Dang nhap manager thanh cong");
                return;

            }
        }
    }
    public void menu() throws SQLException, IOException {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true){
            System.out.println("1. Lay danh sach employee theo projectId" +
                    "\n2. Lay danh sach manager theo projectId " +
                    "\n3. Login manager" +
                    "\n4. Thoat khoi chuong trinh");
            System.out.println("Nhap lua chon: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    getListEByid();
                    break;
                case 2:
                    getListMByid();
                    break;
                case 3:
                    loginManager();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Nhap lai");
                    break;
            }
        }
    }

}
