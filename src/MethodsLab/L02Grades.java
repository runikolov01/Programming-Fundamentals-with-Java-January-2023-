package MethodsLab;

import java.util.Scanner;

public class L02Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());
        getMark(num);
    }
    public static void getMark(double mark){
        String grade = "";
       if(mark >= 2 && mark <= 2.99){
           grade = "Fail";
       }
       else if(mark>=3.00 && mark <= 3.49){
           grade = "Poor";
       }
       else if(mark>=3.50 && mark <= 4.49){
           grade = "Good";
       }
       else if(mark>=4.50 && mark <= 5.49){
           grade = "Very good";
       }
       else if(mark>=5.50 && mark<=6.00){
           grade = "Excellent";
       }
        System.out.println(grade);
    }
}
