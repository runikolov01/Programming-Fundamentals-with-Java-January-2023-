package MethodsMoreExercises;

import java.util.Scanner;

public class E05MultiplicationSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        String sign = "";
        if(num1 == 0|| num2 ==0 || num3 ==0){
sign = "zero";
        }
        else if(num1 > 0 && num2 >0 && num3 > 0){
            sign = "positive";
        }
        else if(num1 < 0 && num2 < 0 && num3 >0){
            sign = "positive";
        }
        else if(num1>0 && num2<0 && num3 <0){
            sign = "positive";
        }
        else if(num1 < 0 && num2 > 0 && num3 <0){
            sign = "positive";
        }
        else{
            sign = "negative";
        }
        System.out.println(sign);
    }
}
