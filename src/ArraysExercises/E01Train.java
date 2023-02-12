package ArraysExercises;

import java.util.Scanner;

public class E01Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(scan.nextLine());
            sum += arr[i];
        }
        for(int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
        System.out.println(sum);
    }
}
