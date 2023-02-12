package ArraysMoreExercises;

import java.util.Scanner;

public class E03RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        long[] fibonacci = new long[n];
        if (n >= 1 && n <= 50) {
            for (int i = 0; i < n; i++) {
                if (i == 0 || i == 1) {
                    fibonacci[i] = 1;
                } else {
                    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                }
            }
            System.out.println(fibonacci[n - 1]);
        } else {
            System.out.println(n);
        }
    }
}
