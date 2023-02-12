package BasicSyntax;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L00NewTry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        doMatrix(input);
    }

    public static void doMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.printf("%d ", n);
            }
            System.out.println();
        }
    }

}