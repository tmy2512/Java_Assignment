import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise2 {
    public static Scanner sc = new Scanner(System.in);

    public static void Question1(int n) {
        int arr[] = new int[n];
        int count[] = new int[100];//

        for(int i = 0; i<n; i++) {
            Scanner sc= new Scanner(System.in);
            System.out.print("arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
//            int vtri = arr[i];
//            count[vtri]++;
            count[arr[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i] != 0) {
                System.out.println(i+" "+count[i]);
            }
        }

    }

    public static void Question2(int n) {
        int sum = 0;
        int tmp;
        for(;n!=0;){
            tmp = n%10;
            sum += tmp;
            n /= 10;
        }
        System.out.println("Sum digit chars = "+ sum);
    }

    public static void Question2b(int n) {
        int sum = 0;
      String[] digit = String.valueOf(n).split("");
      // 1234 => digit[] = 1 2 3 4
        for (int j = 0; j < digit.length; j++) {
            sum += Integer.parseInt(digit[j]);
        }
        System.out.println(sum);
    }

    public static void Question5(int n) {
        int count ;
        int[] arr = new int[100];
        int vtri =0;
        System.out.print(n +"= ");
        for(int i = 2; i<= n; i++) {
            count = 0;
            while(n%i == 0) {
                n /= i;
                arr[i]++;
            }
        }
        // ptrien them ^
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                c++;
                if (c!=1)
                    System.out.print("*");
                if (arr[i]==1)
                    System.out.print(i);
                if (arr[i]!=1)
                    System.out.print(i+"^"+arr[i]);// *a * b* c
            }
        }
    }

    public static boolean Question6(int n) {
        if(n<2) return false;
        for(int i = 2; i<=n/2; i++){
           // liet ke ra cac so nguyen to
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void Question8a(int a, int b) {
        int tmp=1;
        for(int i = 1; i<= a && i<= b; i++) {
            if(a%i == 0 && b%i == 0) {
                tmp = i;
            }
        }
        System.out.println("ucln: "+ tmp);
    }

    public static void Question8b(int a, int b) {
        while(a != b) {
//           b = (a < b) ? (b = b - a) : (a = a - b);
            if(a>b) a = a - b;
            else b = b - a;
        }
        System.out.println("ucln: "+a);
    }

    public static void Question9(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        System.out.print(f0+"\t" +f1+"\t"+fn);
        for(int i = 1; i<n-1; i++) {
            f0 = f1;
            f1 = fn;
            fn = f0+f1;
            System.out.print("\t"+fn);
        }

    }
// kiem tra 1 so co 6 chu so thuan nghich dao
    // 123456 654321
    public static void Question10(int n) {
        int tmp = 0;
            String[] number = String.valueOf(n).split("");;
//        System.out.println(Arrays.toString(number));
        for (int i = 0; i < number.length/2; i++) {
            if(Integer.parseInt(number[i]) != Integer.parseInt(number[number.length-1-i])) {
                System.out.println("ko doi xung ");
                return;
            }
        }
        System.out.println("doi xung");
//            for (int i = 0; i < number.length; i++) {
//                for (int j = (number.length-1);  j >= 0 ; j--) {
//                    if(Integer.parseInt(number[i]) == Integer.parseInt(number[j])) {
//                        tmp++;
//                    }
////                    else System.out.println("Not");
//                }
//            }
//            if(tmp == 6) System.out.println("so tnd");
//            else System.out.println("not");
    }
    public static void Question11(int n) {
        //123
//        String[] num = String.valueOf(n).split("");
//        for (int i = 0; i < num.length; i++) {
//            System.out.print(num[i], );
//        }
    }
    public static void Question13(int n) {
        int a[] = new int[n];
        int tmp[] = new int[100];
        for (int i = 0; i < n; i++) {
            System.out.println("a["+i+"]= ");
            a[i] = sc.nextInt();
        }

             for (int i = 0; i < n ; i++) {
            tmp[a[i]]++;
        }
        // 3 2 1 4 3=> arr
        // 0 1 1 2 1
        // 0 1 2 3 4
        for (int i = 0; i < tmp.length; i++) {
                if(tmp[i] == 1) {
                    System.out.println(i);
                } else if (tmp[i] > 1) {
                    for (int j = 0; j < tmp[i]; j++) {
                        System.out.println(i);
                    }
                }
        }
    }

    //kiem tra 1 so la so nguyen to
    public static boolean SoNguyenTo (int n) {
        for (int i = 2; i < n; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void question14(int n) {
        // xu li in ra day fibonaci
        int f0 =0, f1 = 1, fn = 1;
        System.out.println(fn);
        for (int i = 2; i < n ; i++) {
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;
            if(fn < n){
                if (SoNguyenTo(fn) == true) {
                    System.out.println(fn);
                }
            }


        }

    }

    
    public static void Question15(int n) {
        int sum = 0;
        String digits[] = String.valueOf(n).split("");
        for (int i = 0; i < digits.length; i++) {
            sum += Integer.parseInt(digits[i]);
        }
        for (int i = 1; i < n; i++) {
            if(n%i == 0) {
                if(SoNguyenTo(i) == true) {
                    System.out.println(i);
                }
            }
        }
//        System.out.println(sum);
    }
    public static void main(String[] args) {
//        float a;
        int n; int tmp; int b;
//        System.out.println("Input n = "); n= sc.nextInt();
//        System.out.println("Input b = "); b= sc.nextInt();
//        Question2b(n);
//        Question5(n);
//        Question10(1234321);
//        if(n<2) {
//            System.out.println("Khong phai SNT");
//        }
//        else {
//            for(int i = 2; i<=n; i++) {
//                if(Question6(i) == true) {
//                    System.out.print(i+" ");
//                }
//
//            }
//        }

//Q7
//        int count=0;
//            for(int i = 2; ;i++) {
//                if(Question6(i) == true && count <n) {
//                    count++;
//                    System.out.print(i +" ");
//                }
//            }
//        int i = 1;
//        do {
//               i++;
//                if (Question6(i) == true) {
//
//                    System.out.print(i +" ");
//                    ++count;
//                }
//            }while(count <= n);
//        Question8a(n, b);
//        Question8b(n,b);
//        Question1(10);
//        Question2b(8545604);
//         a = sc.nextFloat();
//        System.out.println(a);
//        Question9(n);
//         Question13(5);
//        question14(10);
        Question15(20);

    }
}
