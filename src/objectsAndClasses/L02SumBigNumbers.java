package objectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class L02SumBigNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger first = new BigInteger(scan.nextLine());
        BigInteger second = new BigInteger(scan.nextLine());
        BigInteger sum = first.add(second);

        System.out.println(sum);
    }
}
