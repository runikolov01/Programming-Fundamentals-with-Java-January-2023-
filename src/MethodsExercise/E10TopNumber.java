package MethodsExercise;

import java.util.Scanner;

public class E10TopNumber {
    public static void main(String[] args) {
        findTopNumber();
    }

    public static void findTopNumber(){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int old = n;
        int sumDigits = 0;
        boolean haveOddDigit = false;

        for (int i = 1; i <= n; i++) {
            haveOddDigit = false;
            sumDigits = 0;
            old = i;
            while (old > 0) {
                int remainder = old % 10;
                if (remainder % 2 != 0) {
                    haveOddDigit = true;
                }
                sumDigits += remainder;
                old = old / 10;
            }
            if (sumDigits % 8 == 0 && haveOddDigit == true) {
                System.out.println(i);
            }
        }
    }
}
