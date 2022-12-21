package BasicSyntaxMoreExercises;

import java.util.Scanner;

public class E01SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        int maxNum = 0;
        int avNum = 0;
        int minNum = 0;

        if (a > b && a > c) {
            maxNum = a;
            if (b >= c) {
                avNum = b;
                minNum = c;
            } else if (c >= b) {
                avNum = c;
                minNum = b;
            }
        } else if (b > a && b > c) {
            maxNum = b;
            if (a >= c) {
                avNum = a;
                minNum = c;
            } else if (c >= a) {
                avNum = c;
                minNum = a;
            }
        } else if (c > a && c > b) {
            maxNum = c;
            if (a >= b) {
                avNum = a;
                minNum = b;
            } else if (b >= a) {
                avNum = b;
                minNum = a;
            }
        }
        System.out.println(maxNum);
        System.out.println(avNum);
        System.out.println(minNum);
    }
}
