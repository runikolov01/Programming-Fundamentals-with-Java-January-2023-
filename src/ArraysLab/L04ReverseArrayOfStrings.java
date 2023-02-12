package ArraysLab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class L04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");

        for (int i = 0; i < arr.length / 2; i++) {
            String oldElement = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = oldElement;
        }
        System.out.println(String.join(" ", arr));
    }
}
