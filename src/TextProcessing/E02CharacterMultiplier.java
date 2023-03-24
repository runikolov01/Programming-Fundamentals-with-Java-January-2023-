package TextProcessing;

import java.util.Scanner;

public class E02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        String first = arr[0];
        String second = arr[1];
        int result = sumMethod(first, second);
        System.out.println(result);
    }

    public static int sumMethod(String first, String second) {
        int totalResult = 0;

        int firstLength = first.length();
        int secondLength = second.length();
        if (firstLength >= secondLength) {
            for (int i = 0; i < firstLength; i++) {
                int currentResult = 0;
                int firstCurrentCharNum = first.charAt(i);

                if (i >= secondLength) {
                    // firstCurrentCharNum = first.charAt(i);
                    currentResult = Integer.parseInt(String.valueOf(firstCurrentCharNum));
                    totalResult += currentResult;
                } else {
                    int secondCurrentCharNum = second.charAt(i);
                    int fNum = Integer.parseInt(String.valueOf(firstCurrentCharNum));
                    int sNum = Integer.parseInt(String.valueOf(secondCurrentCharNum));
                    currentResult = fNum * sNum;
                    totalResult += currentResult;
                }

            }
        } else {
            for (int i = 0; i < secondLength; i++) {
                int currentResult = 0;
                int secondCurrentCharNum = second.charAt(i);

                if (i >= firstLength) {
                    currentResult = Integer.parseInt(String.valueOf(secondCurrentCharNum));
                    totalResult += currentResult;
                } else {
                    int firstCurrentCharNum = first.charAt(i);
                    int fNum = Integer.parseInt(String.valueOf(firstCurrentCharNum));
                    int sNum = Integer.parseInt(String.valueOf(secondCurrentCharNum));
                    currentResult = fNum * sNum;
                    totalResult += currentResult;
                }
            }
        }
        return totalResult;
    }
}
