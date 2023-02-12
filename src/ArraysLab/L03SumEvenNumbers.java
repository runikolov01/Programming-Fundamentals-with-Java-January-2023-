package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class L03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum = numbersArr[i];
            if (currentNum % 2 == 0) {
                evenSum += currentNum;
            }
        }
        System.out.println(evenSum);

    }
}
