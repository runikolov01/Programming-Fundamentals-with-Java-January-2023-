package MethodsMoreExercises;

import java.util.Scanner;

public class E04TribonacciSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int[] arrNum = new int[num];
        if (num >= 3) {
            arrNum[0] = 1;
            arrNum[1] = 1;
            arrNum[2] = 2;

            for (int i = 3; i < num; i++) {
                arrNum[i] = arrNum[i - 1] + arrNum[i - 2] + arrNum[i - 3];
            }
            for (int element : arrNum) {
                System.out.printf("%d ", element);
            }
        }
        else if(num == 1){
            arrNum[0] = 1;
            for (int element : arrNum) {
                System.out.printf("%d ", element);
            }
        }
        else if(num == 2){
            arrNum[0] = 1;
            arrNum[1] = 1;
            for (int element : arrNum) {
                System.out.printf("%d ", element);
            }
        }
    }

}
