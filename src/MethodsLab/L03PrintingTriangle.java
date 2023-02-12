package MethodsLab;

import java.util.Scanner;

public class L03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        printTriangle(n);
    }
    public static void printTriangle(int num){
        for(int i = 1; i <= num; i++){
            for(int k = 1; k <= i; k++) {
                System.out.printf("%d ", k);
            }
            System.out.println();
        }

        for(int m = num-1; m >= 1; m--){
           for(int l = 1; l <= m; l++){
               System.out.printf("%d ", l);
           }
            System.out.println();
        }
    }
}
