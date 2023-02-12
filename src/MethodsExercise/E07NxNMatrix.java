package MethodsExercise;

import java.util.Scanner;

public class E07NxNMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        doMatrix(n);
    }

    public static void doMatrix(int n){
        for(int i = 0; i < n ; i++){
            for(int k = 0; k<n; k++){
                System.out.printf("%d ", n);
            }
            System.out.println();
        }
    }
}
