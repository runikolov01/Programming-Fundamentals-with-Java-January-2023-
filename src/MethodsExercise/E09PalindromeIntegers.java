package MethodsExercise;

import java.util.Scanner;

public class E09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        findPalindrom();

    }

    public static void findPalindrom() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String newText = "";
        while (!input.equals("END")) {
            int length = input.length();
            newText = "";
            for (int i = length - 1; i >= 0; i--) {
                char current = input.charAt(i);
                newText += current;
            }
            if (newText.equals(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scan.nextLine();
        }
    }
}
