package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class E03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];
        int first = 0;
        int second = 0; 

        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(scan.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            first = arr[0];
            second = arr[1];
            if (i % 2 == 1) {
                firstArr[i] = first;
                secondArr[i] = second;
            } else {
                firstArr[i] = second;
                secondArr[i] = first;
            }
        }
        System.out.println();
        for (int kk = 0; kk < secondArr.length; kk++) {
            System.out.printf("%d ", secondArr[kk]);
        }
        System.out.println();
        for (int ll = 0; ll < firstArr.length; ll++) {
            System.out.printf("%d ", firstArr[ll]);
        }
    }
}
