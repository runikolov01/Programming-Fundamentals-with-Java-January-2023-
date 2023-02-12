package DataTypesAndVariables;

import java.util.Scanner;

public class L04TownInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine();
        int population = Integer.parseInt(scan.nextLine());
        int area = Integer.parseInt(scan.nextLine());

        System.out.println("Town " + town + " has population of " + population + " and area " + area + " square km.");
    }
}
