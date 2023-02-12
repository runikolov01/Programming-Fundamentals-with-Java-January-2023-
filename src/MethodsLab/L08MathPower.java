package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L08MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numInput = Double.parseDouble(scan.nextLine());
        double powerInput = Double.parseDouble(scan.nextLine());

        double result = mathPower(numInput, powerInput);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }

    public static double mathPower(double num, double power){
        double result = 1;
        for(int i = 1; i <= power; i++){
            result *= num;
        }
        return result;
    }
}
