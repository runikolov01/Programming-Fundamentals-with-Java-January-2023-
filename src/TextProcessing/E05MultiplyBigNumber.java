package TextProcessing;

import java.math.BigInteger;
import java.util.Scanner;

public class E05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger first = new BigInteger(scan.nextLine());
        BigInteger second = new BigInteger(scan.nextLine());
        BigInteger result = first.multiply(second);
        System.out.println(result);
    }
}
