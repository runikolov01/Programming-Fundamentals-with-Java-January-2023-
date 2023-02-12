package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class E02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputLines = Integer.parseInt(scanner.nextLine());

        while (inputLines > 0) {

            String[] input = scanner.nextLine().split(" ");

            int digitSum = 0;

            long leftNumber = Long.parseLong(input[0]);
            long rightNumber = Long.parseLong(input[1]);

            if (leftNumber >= rightNumber) {

                for (int j = 0; j < input[0].length(); j++) {
                    digitSum += Math.abs(leftNumber % 10);
                    leftNumber = leftNumber / 10;
                }
            } else {

                for (int j = 0; j < input[1].length(); j++) {
                    digitSum += Math.abs(rightNumber % 10);
                    rightNumber = rightNumber / 10;
                }
            }
            System.out.println(digitSum);
            inputLines--;
        }
    }
}
