package MethodsMoreExercises;

import java.util.Scanner;

public class E01DataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        switch (input) {
            case "int":
                System.out.println(calculator(Integer.parseInt(scan.nextLine())));
                break;
            case "real":
                double result = calculator(Double.parseDouble(scan.nextLine()));
                System.out.printf("%.02f", result);
                break;
            case "string":
                System.out.println(calculator(scan.nextLine()));
        }
    }

    public static int calculator(int a) {
        return a * 2;
    }

    public static double calculator(double a){
        return a * 1.5;
    }

    public static String calculator(String a){
        String result = "$" + a + "$";
        return result;
    }
}
