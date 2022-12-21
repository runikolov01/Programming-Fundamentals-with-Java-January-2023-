package BasicSyntaxExercises;

import java.util.Scanner;

public class E09Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        double perCapsule = 0;
        int days = 0;
        int numCapsules = 0;
        double price = 0;
        double total = 0;
        for (int i = 1; i <= num; i++){
            perCapsule = Double.parseDouble(scan.nextLine());
            days = Integer.parseInt(scan.nextLine());
            numCapsules = Integer.parseInt(scan.nextLine());
            price = ((days * numCapsules) * perCapsule);
            total += price;
            System.out.printf("The price for the coffee is: $%.02f%n", price);

        }
        System.out.printf("Total: $%.02f", total);
    }
}
