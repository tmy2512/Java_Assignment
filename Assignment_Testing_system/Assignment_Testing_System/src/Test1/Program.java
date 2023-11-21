package Test1;

import Test1.Department;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Program {
    public static void Question1(Exam exam) {
        System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(exam.getCreataDate()));
    }
    public static void Question2(Exam e){
//        System.out.printf("%tY- %td - %tm - %tH - %tM - %tS", e.getCreataDate(), e.getCreataDate(), e.getCreataDate(), e.getCreataDate(), e.getCreataDate(), e.getCreataDate() );
//        System.out.printf(" %td - %tm ",   e.getCreataDate(), e.getCreataDate() );
    }
    public static void random() {
        Random random = new Random();
//        Date date = new Date();
//        System.out.println(date);
        int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
        int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
        long randomDay = random.nextInt(maxDay - minDay)+minDay;
        int now = (int) LocalDate.now().toEpochDay();
        int oneyrago = (int) LocalDate.now().toEpochDay();
        long randoomday = random.nextInt(now-365)-now;
        LocalDate randomBirthDate = LocalDate.ofEpochDay(randoomday);

        System.out.println(randomBirthDate);
//        String[] students = {"Nguyen Van A", "Nguyen Van B", "Nguyen Van C", "Nguyen Van D" };
//        String name="";
////        name = students[ThreadLocalRandom.current().nextInt(students.length)];
//        name = students[random.nextInt(students.length)];
//        System.out.println(name);
    }
    public static void constructDep( ) {
        int id;
        String name ;
        System.out.println("Nhap id:"); id = new Scanner(System.in).nextInt();
        System.out.println("Nhap name: "); name = new Scanner(System.in).nextLine();
        Department deparmentn = new Department(id, name);
        System.out.println(deparmentn.getId()+deparmentn.getName());
    }
    public static void constructAcc(Group[] gs, Position p, Department d ) throws ParseException {
        int id;
        String email="", name="", username="";
        String createDate="";
        System.out.println("Nhap id:"); id = new Scanner(System.in).nextInt();
        System.out.println("Nhap name: "); name = new Scanner(System.in).nextLine();
        System.out.println("Nhap date: "); createDate = new Scanner(System.in).nextLine();
        Account accn = new Account(id, email, name, username, d, p,  new SimpleDateFormat("dd/MM/yyyy").parse(createDate), gs);
        System.out.println(accn.getId()+accn.getFullname());
    }
    public void question9(Account[] a, Group[] g) {
        String username = "";
        System.out.println("Nhap username: ");
        username = new Scanner(System.in).nextLine();
        for(Account i : a) {
            System.out.println(i.getUsername());
        }
        for (Group i : g) {
            System.out.println(i.getName());
        }
        String group = "";
        System.out.println("Nhap ten group: ");
//        group3.setAccounts();
    }
    public static void Question11(Account [] a, Group[] g) {
        String username = "";
        System.out.println("Nhap username: ");
        username = new Scanner(System.in).nextLine();
        for(Account i : a) {
            System.out.println(i.getUsername());
        }

        Random random = new Random();
        System.out.println(g[random.nextInt(g.length)].getName());
    }

    public static void main(String[] args) throws ParseException {
        Department department1 = new Department(1, "Sale");
        Department department2 = new Department(2, "Marketing");
        Department department3 = new Department(3, "IT");
        Department department4 = new Department(4, "Content");
        Position position1 = new Position(1, "Dev");
        Account acc = new Account(1, "person@vti.com", "Le Ngoc Anh", "ngocanh123", department1, position1, new SimpleDateFormat("dd/MM/yyyy").parse("21/12/2003"), null  );
        Account acc3 = new Account(3, "person3@vti.com", "Nguyen Ngoc Diep", "ngocdiep123", department1, position1, new SimpleDateFormat("dd/MM/yyyy").parse("21/12/2004"), null  );
        Account acc5 = new Account(5, "person5@vti.com", "Tran Kim Sao", "kimsao123", department1, position1, new SimpleDateFormat("dd/MM/yyyy").parse("21/12/2004"), null  );
        Account accg[] = {acc};
        Group group1 = new Group(1, "Java fresher", new SimpleDateFormat("dd/MM/yyyy").parse("21/12/2019"), accg);
        Group group2 = new Group(2, "C# fresher", new SimpleDateFormat("dd/MM/yyyy").parse("01/12/2019"), accg);
        Account acc2 = new Account();
        acc2.setId(2) ;
        acc2.setFullname("Do Tra My");
        acc2.setPosition(position1);
        Group[] groups = {group1, group2};
        Group[] groups2 = {group1};
        acc2.setGroups(groups);
        acc3.setGroups(groups);
        // topic question
        CategoryQuestion categoryQuestion1 = new CategoryQuestion(1, "C#");
        CategoryQuestion categoryQuestion2 = new CategoryQuestion(2, ".NET");
        CategoryQuestion categoryQuestion3 = new CategoryQuestion(3, "Java");
        CategoryQuestion categoryQuestion4 = new CategoryQuestion(4, "Python");
        //Answer
        Answer answer1 = new Answer(1, "Answer1", false);
        Answer answer2 = new Answer(2, "Answer2", true);
        Answer answer3 = new Answer(3, "Answer3", false);
        Answer answer4 = new Answer(4, "Answer4", true);
        //Typequestion
        TypeQuestion type1 = new TypeQuestion(1, "Essay");
        TypeQuestion type2 = new TypeQuestion(2, "Multichoice");
        //Question
        Answer[] ans1 = {answer1, answer2};
        Answer[] ans2 = {answer3, answer4};
        Question question1 = new Question(1, "Question1", categoryQuestion1, type1, acc, new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2020"), ans1);
        Question question2 = new Question(2, "Question2", categoryQuestion2, type2, acc3, new SimpleDateFormat("dd/MM/yyyy").parse("09/04/2022"), ans2);
        Question question3 = new Question(3, "Question3", categoryQuestion1, type2, acc, new SimpleDateFormat("dd/MM/yyyy").parse("09/04/2022"), ans2);
        //Exam
        Question[] qus1 = {question1, question2};
        Exam exam1 = new Exam(1, "Exam001", "De kiem tra giua ki", categoryQuestion1, 60, acc, new SimpleDateFormat("dd/MM/yyyy").parse("09/04/2022"), qus1);
//        constructDep();
        Group[] groups_sort = {group1, group2};



//Question8
//        System.out.println("Nhap choose: ");
//        int choose;
//        String continue1="";
//       while(true){
//           choose = new Scanner(System.in).nextInt();
//           switch(choose) {
//               case 1:
//                   constructDep();
//                   System.out.println("Continue?\n Co - Khong");
//                   continue1 = new Scanner(System.in).nextLine();
//                   switch (continue1) {
//                       case "Co":
//                           choose = new Scanner(System.in).nextInt();
//                       case "Khong":
//                           return;
//
//                   }
//                   break;
//               case 2:
//                   constructAcc(groups, position1, department3);
//                   return;
//               default:
//                   System.out.println("Nhap sai");
//                   break;
//           }
//       }

//Question9
        //        program.question9(accounts, grs);
//        Question11(a, g);

        // Question2:

//            if (acc2.getGroups().length == 0) {
//                System.out.println("Nhan vien nay chua co group");
//            } else if (acc2.getGroups().length == 1 || acc2.getGroups().length == 2) {
//                System.out.println("Nhan vien thuoc group " + acc2.getGroups()int.class.getName().);
//            }
//Question1
        //        if(acc.getDepartment() == null) {
//            System.out.println("Nhan vien "+ acc.getFullname()+" chua co phogn ban");
//        }
//        else {
//            System.out.println("Nhan vien "+ acc.getFullname()+" thuoc phogn ban "+ acc.getDepartment().getName() );
//
//        }
//        System.out.println(acc.getDepartment() == null ? "Nhan vien "+ acc.getFullname()+" chua co phogn ban" :
//                "Nhan vien "+ acc.getFullname()+" thuoc phogn ban "+ acc.getDepartment().getName() );
//        System.out.println((acc2.getPosition().getName() == "Dev") ? "Day la Developer" : "Nguoi nay khong phai dev");
//        System.out.println(group1.getAccounts().length);

//Question5
//        int count_acc = group1.getAccounts().length;
//        switch(count_acc) {
//            case 1 :
//                System.out.println("Nhom co 1 thanh vien");
//                break;
//            case 2 :
//                System.out.println("Nhom co 2 thanh vien");
//                break;
//            case 3 :
//                System.out.println("Nhom co 3 thanh vien");
//                break;
//            default:
//                System.out.println("Nhom co nhieu thanh vien");
//        }
// Question7
//        switch (acc2.getPosition().getName()) {
//            case "Dev":
//                System.out.println("Day la developer");
//                break;
//            default:
//                System.out.println("Day khong phai la developer");
//        }

 //Question8
//        Account[] acc_group = {acc2, acc, acc2, acc, acc2, acc};
//        System.out.println("\n===for===");
//        for(int i = 0; i< acc_group.length; i++) {
//            System.out.println("Fullname:" +acc_group[i].getFullname());
//        }
//        System.out.println("===foreach===");
//        for (Account account : acc_group) {
//            System.out.println("Fullname:" +account.getFullname());
//        }

// Question9
//        Department[] departments = {department1, department2};
//            for(Department department : departments) {
//                System.out.println(department.getId()+"-"+department.getName());
//            }
//Question10
//        Account[] account_g = {acc2, acc};
//        for (int i = 0; i < account_g.length; i++) {
//            System.out.println("Thong tin account "+i+": "+
//            "Email: "+account_g[i].getEmail()+"\n"+
//            "Full name: "+account_g[i].getFullname()+"\n"+
//            "Department: "+account_g[i].getDepartment().getName()+"\n");
//        }
//Question11
//Question12
//        Department[] departments = {department1, department2, department3, department4};
//        for(int i = 0; i< departments.length; i++) {
//            if(i == 2) {
//                return;
//            }
//            System.out.println("Thong tin department "+i+": "+
//                    "id: "+departments[i].getId()+"\n"+
//                    "Department name: "+departments[i].getName()+"\n");
//
//        }
// break: end loops
// return: end program
//Question13: continue
//Question14: for -> if( accounts[i]. getid() < 4) -> sout
//Question15: for-> i=0; i<=20; i+=2
//Question16a:
//int i = 0;
//        while(i<= 20) {
//            System.out.println(i);
//            i+=2;
//        }
//Question16b-14
//        Account[] accounts = {acc, acc3, acc5};
//        int i = 0;
//        while (i < accounts.length) {
//            if (accounts[i].getId() >= 4) return;
//            System.out.println("Thong tin account "+i+": "+
//            "Email: "+accounts[i].getEmail()+"\n"+
//            "Full name: "+accounts[i].getFullname()+"\n"+
//            "Department: "+accounts[i].getDepartment().getName()+"\n");
//            i++;
//        }
//Question16c: in ra thong tin account except account thu 2
        //while
//        Account[] accounts = {acc, acc3, acc5};
//        int i = 0;
//        while (i < accounts.length ) {
//            if (i == 1) {i++;continue;}
//            System.out.println("Thong tin account "+i+": "+
//                    "Email: "+accounts[i].getEmail()+"\n"+
//                    "Full name: "+accounts[i].getFullname()+"\n"+
//                    "Department: "+accounts[i].getDepartment().getName()+"\n");
//            i++;
//        }
        // do..while
//        do {
//            if (i == 1) {i++;continue;}
//            System.out.println("Thong tin account "+i+": "+
//                    "Email: "+accounts[i].getEmail()+"\n"+
//                    "Full name: "+accounts[i].getFullname()+"\n"+
//                    "Department: "+accounts[i].getDepartment().getName()+"\n");
//            i++;
//        }while ( i < accounts.length);
//        Account[] acc_group = {acc3, acc, acc3, acc, acc3, acc,};
//        System.out.printf("%s  %s %n ", "Fullname"," Department");
//        for(int i = 0; i< acc_group.length; i++) {
//            System.out.printf("%s  %s\n  ", acc_group[i].getFullname(),acc_group[i].getDepartment().getName());
//        }



    }
}
