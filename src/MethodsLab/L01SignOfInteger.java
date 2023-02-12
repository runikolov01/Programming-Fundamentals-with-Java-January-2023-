package MethodsLab;

import java.util.Scanner;

public class L01SignOfInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        printSign(num);
    }

    public static void printSign(int num){
        String value = "";
        if(num<0){
            value = "negative";
        }
        else if(num==0){
            value = "zero";
        }
        else{
            value = "positive";
        }
        System.out.printf("The number %d is %s.", num, value);
    }
}
