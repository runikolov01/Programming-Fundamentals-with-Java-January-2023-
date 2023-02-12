package MethodsExercise;

import java.util.Scanner;

public class E03CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char from = scan.nextLine().charAt(0);
        char end = scan.nextLine().charAt(0);
        findCharacters(from, end);
    }

    public static void findCharacters(char from, char end) {
        int first = Math.min(from, end);
        int last = Math.max(from, end);
        int total = Math.abs(first - last) - 1;
        char[] charArr = new char[total];
        int k = 0;

        for (int i = first + 1; i < last; i++) {
            char current = (char) i;
            charArr[k] = current;
            k += 1;
        }

        for (int m = 0; m < total; m++) {
            System.out.printf("%c ", charArr[m]);
        }
    }
}

