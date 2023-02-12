package MethodsExercise;

import java.util.Scanner;

public class E04PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pass = scan.nextLine();
        boolean isValid = true;
        int length = pass.length();
        int counterDigits = 0;
        int counterUpper = 0;
        int counterLower = 0;

        if (length < 6 || length > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }

        for (int i = 0; i < length; i++) {
            char current = pass.charAt(i);
            int intCurrent = (int) current;
            if (intCurrent >= 48 && intCurrent <= 57 || intCurrent >= 65 && intCurrent <= 90 || intCurrent >= 97 && intCurrent <= 122) {
                if (intCurrent >= 48 && intCurrent <= 57) {
                    counterDigits += 1;
                }
                if (intCurrent >= 65 && intCurrent <= 90) {
                    counterUpper += 1;
                }
                if (intCurrent >= 97 && intCurrent <= 122) {
                    counterLower += 1;
                }
            } else {
                System.out.println("Password must consist only of letters and digits");
                isValid = false;
                break;
            }
        }

        if (counterDigits < 2) {
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }
        if(isValid){
            System.out.println("Password is valid");
        }
    }
}
