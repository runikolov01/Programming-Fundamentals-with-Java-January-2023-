package DataTypesAndVariables;

import java.util.Scanner;

public class L02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pounds = Double.parseDouble(scan.nextLine());
        double usd = 1.36 * pounds;
        System.out.printf("%.03f", usd);
    }
}
