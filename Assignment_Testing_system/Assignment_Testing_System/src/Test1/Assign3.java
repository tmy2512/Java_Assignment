package Test1;

import java.util.*;

import static jdk.nashorn.internal.objects.NativeString.charAt;

public class Assign3 {
    public static boolean Question11(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = s2.length()-1; j >= 0 ; j--) {
                if(s1.charAt(i) == s2.charAt(j)){
                    return true;
                }
            }
        }
        return true;
    }
    public static boolean Question13(String s1) {
        String num2 ="0123456789";
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    int i =0;
    int tmp = 0;
    while (i< numbers.length) {
        if(s1.contains(numbers[i]) || s1.equals("null")) {
            tmp++;

        }
        i++;
    }
    if(tmp >= 1) {
        return false;
    }
        return true;
    }

    public static void main(String[] args) {
//        Account_test acc1 = new Account_test(1, "Person1", 5240.4f);
//        Account_test acc2 = new Account_test(2, "Person2", 10970.055f);
        GroupTest gr1 = new GroupTest(1, "Java");
        GroupTest gr2 = new GroupTest(2, "Aava_C#");
        GroupTest gr3 = new GroupTest(2, "Bava_C#");
        GroupTest gr4 = new GroupTest(2, "cava_C#");
        GroupTest gr5 = new GroupTest(2, "dava_C#");
        GroupTest[] gr = {gr1, gr2, gr3, gr4, gr5};
        String[] a = new String[0];

        List<String> name = new ArrayList<>(Arrays.asList(a));
        for (GroupTest x : gr ) {
            name.add(x.getName());
//            if(x.getId() == 1)
//                System.out.println(x);
//            if(x.getName().equals("Java")) System.out.println(x.getId()+" "+ x.getName());
//            if(x.getName().contains("java")) System.out.println(x.getId()+" "+ x.getName());
        }
        a = name.toArray(new String[0]);
        Arrays.sort(a);
//        Arrays.sort(a);
//        for (String x:a) {
            System.out.println(Arrays.toString(a));
//        System.out.println(name);
//        int x, y;
//        x= (int)acc1.getSalary();
//        y= (int)acc2.getSalary();
//        System.out.println(x+"-"+y);

//       Account_test[] accs = new Account_test[5];
//       Date date = new Date();
//        for (int i = 0; i < accs.length; i++) {
//            accs[i] = new Account_test();
////            Account_test accountTest = new Account_test(i, i, i, i, new Date());
//            accs[i].setEmail("Email "+i);
//            accs[i].setUsername("Username "+i);
//            accs[i].setFullname("fullname "+i);
//            accs[i].setCreateDate(date);
//        }
//        for (Account_test i: accs) {
//            System.out.println("Email: "+i.getEmail());
//        }
        String s1 = "", s2 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string: ");
        s1 = sc.nextLine();
//        s2 = sc.nextLine();
//        System.out.println(s1.length());
//        System.out.println(s1.concat(s2));

//        System.out.println(s1.charAt(0) == s1.toUpperCase().charAt(0));
        // dung gap khoang trang thi viet hoa

        s1 = s1.replaceAll("\\s+", " ").trim();
        s2 = s2.replaceAll("\\s+", " ").trim();
        String[] str = s1.split(" ");


//        int tmp;
//        System.out.println("nhap tmp: "); tmp = sc.nextInt();
//        if((s1.length()) % tmp == 0) {
//            System.out.println("yes");
//            for (int i = 0; i < s1.length(); i+=tmp) {
//                // coi nhu tinh ca space
//                System.out.println(s1.substring(i, tmp) +"-");
//                tmp += tmp;
//            }
//        }
//        else System.out.println("ko");

        // tai sao list khong khoi tao ma no khong in ra mang defaul... ma []
//        List<String> test = new ArrayList<>();
//        abcdefghi chia ra cac phan, moi phan co n ki tu

//        for (int i = str.length-1; i >= 0; i--) {
//            System.out.print(str[i]+" ");
//        }

//        String tmp ;
//        System.out.println("Nhap ki tu chi dinh: ");tmp = sc.nextLine();
//        System.out.println(s1.replace(tmp, "*"));

//        if(Question13(s1) == true) System.out.println("true");
//        else System.out.println("false");

//        for (int i = s1.length()-1; i >= 0 ; i--) {
//            System.out.print(s1.charAt(i));
//        }

//        for (int i = 0; i < s1.length(); i++) {
//            if(s1.charAt(i) == 'a') {
//                count++;
//            }
//        }


//        if(!Question11(s1, s2) == true)
//            System.out.println("Khong phai chuoi dao nguoc");
//        else
//            System.out.println("yes!!");
//        int count = 0;
//        for (int i = 0; i < s1.length(); i++) {
//            if(s1.charAt(i) == ' ') {
//                count++;
//            }
//        }

        String s3 = "";
//        for (int j = 0; j < str.length ; j++) {
//            s3 = str[j].replace(str[j].charAt(0), str[j].toUpperCase().charAt(0));
//            System.out.print((" "+s3).trim());
//        }
        // lay 1 phan tu noi voi cac phan tu con lai, duyet tu str
//        for ( String x : str) {
//              s3 = x.substring(0, 1).toUpperCase()+ x.substring(1)+" ";
//            System.out.print(s3);
//        }
//
//        System.out.print(s1.substring(0, s1.indexOf(' ')  ));
//        System.out.println("Ho la: "+str[0]);
//        System.out.println(s1.substring(s1.indexOf(' '), s1.lastIndexOf(' ')));
//        System.out.println(str[str.length - 1]);

    }

}
