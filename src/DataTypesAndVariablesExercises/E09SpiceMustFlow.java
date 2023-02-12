package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class E09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yield = Integer.parseInt(scan.nextLine());
        int totalExtract = 0;
        int totalConsume = 26;
        int days = 0;
        if (yield >= 100) {
            while (yield >= 100) {
                totalConsume += 26;
                totalExtract += yield;
                days++;
                yield -= 10;
            }
            System.out.println(days);
            totalExtract -= totalConsume;
            System.out.println(totalExtract);
        } else {
            totalConsume = 0;
            System.out.println(days);
            totalExtract -= totalConsume;
            System.out.println(totalExtract);
        }
    }
}
