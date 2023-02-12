package ArraysMoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class E01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        String input = "";
        int sum = 0;
        int currentNum = 0;
        int[] numArr = new int[num];

        for(int i = 0; i < num; i++) {
            input = scan.nextLine();
            sum = 0;
            currentNum = 0;

            for (int k = 0; k < input.length(); k++) {
                char currentLetter = input.charAt(k);
                int numLetter = (int) currentLetter;
                if (currentLetter == 'a' || currentLetter == 'A' || currentLetter == 'e' || currentLetter == 'E' ||
                        currentLetter == 'i' || currentLetter == 'I' || currentLetter == 'o' || currentLetter == 'O' ||
                        currentLetter == 'u' || currentLetter == 'U') {
                    currentNum = numLetter * input.length();
                } else {
                    currentNum = numLetter / input.length();
                }
                sum += currentNum;
            }
            numArr[i] = sum;
        }
        Arrays.sort(numArr);
        for (int number: numArr) {
            System.out.println(number);
        }
    }
}
