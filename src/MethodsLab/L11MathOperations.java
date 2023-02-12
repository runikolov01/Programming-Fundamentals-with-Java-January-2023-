package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L11MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int b = Integer.parseInt(scan.nextLine());
        DecimalFormat df = new DecimalFormat("0.##");
        System.out.printf(String.valueOf(Math.round(Float.parseFloat(df.format(calculator(a, operator, b))))));
    }

    public static double calculator(int a, String operator, int b) {
        double result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            case "-":
                result = a - b;
            default:
                break;
        }
        return result;
    }
}
