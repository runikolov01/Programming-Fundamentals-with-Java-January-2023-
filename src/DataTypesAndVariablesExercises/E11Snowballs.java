package DataTypesAndVariablesExercises;

import java.math.BigInteger;
import java.util.Scanner;

public class E11Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int snow = 0;
        int time = 0;
        int quality = 0;
        String format = "";
        BigInteger maxValue = BigInteger.valueOf(Integer.MIN_VALUE);

        BigInteger totalValue = BigInteger.valueOf(0);

        for (int i = 1; i <= number; i++) {
            snow = Integer.parseInt(scan.nextLine());
            time = Integer.parseInt(scan.nextLine());
            quality = Integer.parseInt(scan.nextLine());
            totalValue = BigInteger.valueOf(snow).divide(BigInteger.valueOf(time)).pow(quality);
            if (totalValue.compareTo(maxValue) >= 0) {
                maxValue = totalValue;
                format = String.format("%d : %d = %d (%d)", snow, time, maxValue, quality);
            }

        }
        System.out.println(format);
    }
}
