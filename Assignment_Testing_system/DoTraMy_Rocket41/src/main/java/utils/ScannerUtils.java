package utils;

import java.util.Scanner;

public class ScannerUtils {
    private static Scanner sc= new Scanner(System.in);
    private static void printErrString(String errString) {
        System.out.println(errString);
    }

    public static int inputInt() {
        while (true) {
            int inputNumber = sc.nextInt();
            try {
                return inputNumber;

            } catch (Exception e) {
                System.out.println("Khong phai dinh dang so!!");
            }
        }
    }

    private static float inputFloat(Scanner sc, String errString) {
        while (true) {
            try {
                return Float.parseFloat(sc.nextLine());

            } catch (Exception e) {
                printErrString(errString);
            }
        }
    }

    private static double inputDouble(Scanner sc, String errString) {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine());

            } catch (Exception e) {
                printErrString(errString);
            }
        }
    }

    public static String inputString() {
        while (true) {
            String inputString = sc.nextLine().trim();
            if (inputString == null || inputString.isEmpty()) {
                System.out.println("Nhap sai! Nhap lai: ");
            }
            else  {
                return inputString;
            }
        }
    }

    public static String inputEmail() {
        while (true) {
            String inputString = ScannerUtils.inputString().trim();
            boolean checkEmail = true;
            if (!inputString.contains("@") || !inputString.contains(".")) {
                checkEmail = false;
            }
            if (checkEmail == false) {
                System.out.println("Sai dinh dang email, nhap lai: ");
            }
            else  {
                return inputString;
            }
        }
    }



    public static String inputPassword() {
        while (true) {
            String inputString = ScannerUtils.inputString().trim();
            boolean checkLength = true;
            boolean checkUpperCase = false;
            if (inputString.length()<6|| inputString.length()>12) {
                checkLength = false;
            }
            for (int i = 0; i < inputString.length(); i++) {
                if (Character.isUpperCase(inputString.charAt(i)) == true) {
                    checkUpperCase= true;
                }
            }

            if (checkLength == true) {
                if (checkUpperCase == false) {
                    System.out.println("Phai co it nhat 1 ki tu viet hoa. Nhap lai: ");
                }
                else {
                    return inputString;
                }

            }
            else  {
                System.out.println("Sai do dai email, nhap lai: ");
            }
        }
    }

}
