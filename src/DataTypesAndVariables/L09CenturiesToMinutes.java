package DataTypesAndVariables;

import java.util.Scanner;

public class L09CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        byte century = Byte.parseByte(scan.nextLine());

        double years = century * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;

        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes", century, years, days, hours, minutes);
    }
}
