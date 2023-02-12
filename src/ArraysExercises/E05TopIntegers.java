package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class E05TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] input = scan.nextLine().split(" ");
        String command = input[0];

        while (!command.equals("end")) {
            if (command.equals("swap")) {
                String first = input[1];
                String second = input[2];
                int num1 = Integer.parseInt(first);
                int num2 = Integer.parseInt(second);

                int temp = arr[num1];
                arr[num1] = arr[num2];
                arr[num2] = temp;
            } else if (command.equals("multiply")) {
                String first = input[1];
                String second = input[2];
                int num1 = Integer.parseInt(first);
                int num2 = Integer.parseInt(second);
                int mult = arr[num1] * arr[num2];
                arr[num1] = mult;
            } else if (command.equals("decrease")) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] -= 1;
                }
            }
            input = scan.nextLine().split(" ");
            command = input[0];
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.printf("%d ", arr[arr.length-1]);
    }
}
