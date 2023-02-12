package DataTypesAndVariables;

import java.util.Scanner;

public class L01ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int meters = Integer.parseInt(scan.nextLine());
        double metDouble = Double.parseDouble(String.valueOf(meters));
        double km = metDouble/1000;

        System.out.printf("%.02f", km);
    }
}
