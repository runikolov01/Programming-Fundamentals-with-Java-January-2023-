package MethodsExercise;

import java.util.Scanner;

public class E01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        System.out.println((printTheSmallestNum(a, b, c)));
    }

        public static int printTheSmallestNum ( int a, int b, int c){
        int smallest = 0;
            if (a <= b && a <= c) {
                smallest = a;
            } else if (b <= a && b <= c) {
                smallest = b;
            } else if (c <= a && c <= b) {
                smallest = c;
            }
            return smallest;
        }
}