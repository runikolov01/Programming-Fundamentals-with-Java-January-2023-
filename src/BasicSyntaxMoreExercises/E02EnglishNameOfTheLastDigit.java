package BasicSyntaxMoreExercises;

import java.util.Scanner;

public class E02EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int lastDigit = 0;
        String name = "zero";

        String numString = Integer.toString(num);
        int length = numString.length() - 1;
        char current = numString.charAt(length);

        lastDigit = Character.getNumericValue(current);

        switch (lastDigit) {
            case 0:
                name = "zero";
                break;
            case 1:
                name = "one";
                break;
            case 2:
                name = "two";
                break;
            case 3:
                name = "three";
                break;
            case 4:
                name = "four";
                break;
            case 5:
                name = "five";
                break;
            case 6:
                name = "six";
                break;
            case 7:
                name = "seven";
                break;
            case 8:
                name = "eight";
                break;
            case 9:
                name = "nine";
                break;
        }
        System.out.println(name);
    }
}
