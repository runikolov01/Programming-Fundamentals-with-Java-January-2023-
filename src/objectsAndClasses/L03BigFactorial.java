package objectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class L03BigFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        BigInteger fact = new BigInteger(String.valueOf(1));
        for(int i = 1; i<=num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
}
