package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class L05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumEven = 0;
        int sumOdd = 0;
        for(int i = 0; i < numbersArr.length; i++){
            int currentNum = numbersArr[i];
            if (currentNum % 2 == 0) {
                sumEven += currentNum;
            }
            else {
                sumOdd += currentNum;
            }
        }
        int diff = sumEven - sumOdd;
        System.out.println(diff);
    }
}
