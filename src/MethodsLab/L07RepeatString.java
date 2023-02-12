package MethodsLab;

import java.util.Scanner;

public class L07RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int num = Integer.parseInt(scan.nextLine());
        String resultText = repeatString(word, num);
        System.out.println(resultText);
    }

    public static String repeatString(String word, int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += word;
        }
        return result;
    }
}