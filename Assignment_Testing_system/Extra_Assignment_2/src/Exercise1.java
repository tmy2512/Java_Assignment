import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Queue;
import java.util.Scanner;

import static java.lang.Math.round;

public class Exercise1 {
    // Question1
    public static  void Question1(Float x) {
        Float a_inch, b_foot;
        a_inch = (round(x / 2.54f * 100)) / 100f;
        b_foot = round((x/12f)*100)/100f;
        System.out.println(a_inch + "_"+b_foot);
    }

    // Question2
    public static void Question2(int x) {
        int hour, min, second;
        if(x<0 || x > 68399) {
            System.out.println("Not valid number");
        }
        else {
            // 5400 ==== /3600=round(1)======= /5400-hour*3600= 1800====== /30min
            hour = (x/3600);
            min =  x%3600 / 60;
            // dung % cho x-(hour*3600)====== ((x - (hour*3600))/60)
            second =  x%3600%60;
            // (x - (hour*3600) - (min * 60));
            Time time = new Time(hour, min, second);
            System.out.println(time);
        }
    }
    // Question3: Viết chương trình nhập vào 4 số nguyên.
    //Hiển thị ra số lớn nhất và nhỏ nhất
    public static void Question3 (int n) {
        int arr[] = new int[n];

        for(int i = 0; i<n; i++) {
            Scanner sc= new Scanner(System.in);
            System.out.print("arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min=arr[0];
        for(int j : arr) {
            if(max < j) {
                max = j;
            }
            if(min > j) {
                min = j;
            }
        }

        System.out.println(max + "."+min);
    }

    public static void Question4(int a, int b) {
        int sum = 0;
        int minus = 0;
        minus = a - b;
        String result;
        result = (minus < 0) ? "The first number is less than one" : "The first number is greater than one";
        System.out.println(result);
    }

    public static void Question5(int a, int n) {
String result;
        result         = (a%n == 0) ? "a divisible n" : "a indivisible n ";
        System.out.println(result);
    }

    public static void Question6(float a, float b, float c) {
        float avg_mark = ((a*2) + b + c)/4;
        String capacity;
        capacity = avg_mark >= 9 ? "Xuat sac" :
                (avg_mark >= 8 && avg_mark < 9) ? "Gioi" :
                        (avg_mark >= 7 && avg_mark < 8) ? "Kha" :
                                (avg_mark >= 6 && avg_mark < 7) ? "Trung binh kha" :
                                        (avg_mark >= 5 && avg_mark < 6) ? "Trung binh":"Khogn xep loai";
        System.out.print("Diem trung binh: "+avg_mark);
        System.out.println("\nXep loai hoc luc: "+capacity);
    }
    public static void main(String[] args) {
        Float x;
        int a, n, c;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập giá trị của x: ");
//        x = sc.nextFloat();
//        Question1(x);

//        System.out.println("Input a value: ");
//        a = sc.nextInt();
//        Question2(a);

        System.out.println("Input quantity of array: ");
        n = sc.nextInt();
        Question3(n);

//        System.out.print("a: "); a = sc.nextInt();
//        System.out.print("\nn: "); n = sc.nextInt();
//        Question4(a, n);

//        System.out.print("a: "); a = sc.nextInt();
//        System.out.print("\nn: "); n = sc.nextInt();
//        Question5(a, n);

//        System.out.print("Math mark: "); a = sc.nextInt();
//        System.out.print("\nPhysic mark: "); n = sc.nextInt();
//        System.out.print("\nChemistry mark: "); c = sc.nextInt();
//        Question6(a,n,c);
    }
}
