package ArraysLab;

import java.util.Scanner;

public class L02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] numsArr = new int[n];

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());
            numsArr[i] = currentNum;
        }

        for (int i = numsArr.length - 1; i >= 0; i--) {
            System.out.printf("%d ", numsArr[i]);
        }
    }
}
