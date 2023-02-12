package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class E06EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int index = 0;
        int currentLeft = 0;
        int currentRight = 0;
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < numArr.length; i++) {
            sumLeft = 0;
            sumRight = 0;
            if (i == 0 && numArr.length==1) {
                sumLeft = 0;
                sumRight = 0;
            } else {
                for (int k = i + 1; k < numArr.length; k++) {
                    currentRight = numArr[k];
                    sumRight += currentRight;
                }
                for (int m = 0; m < i; m++) {
                    currentLeft = numArr[m];
                    sumLeft += currentLeft;
                }
                if (sumLeft == sumRight) {
                    index = i;
                    break;
                }
            }
        }
        if (sumLeft == sumRight) {
            System.out.println(index);
        } else {
            System.out.println("no");
        }
    }
}
