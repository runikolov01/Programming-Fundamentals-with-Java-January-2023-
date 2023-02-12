package MethodsExercise;

import java.util.Scanner;

public class E05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());

        int firstResult = sum(first, second);
        int finalResult = substract(third, firstResult);
        System.out.println(finalResult);
    }

    public static int sum(int first, int second){
        return first + second;
    }

    public static int substract(int third, int firstResult){
        return firstResult - third;
    }
}
