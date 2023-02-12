package MethodsLab;

import java.util.Scanner;

public class L04Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        switch (command) {
            case "add":
                add(a, b);
                break;
            case "divide":
                divide(a, b);
                break;
            case "multiply":
                multiply(a, b);
                break;
            case "subtract":
                subtract(a, b);
                break;
        }

    }

    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void divide(int a, int b) {
        int total = a / b;
        System.out.println(total);
    }

    public static void multiply(int a, int b) {
        int total = a * b;
        System.out.println(total);
    }

    public static void subtract(int a, int b) {
        int total = a - b;
        System.out.println(total);
    }
}
