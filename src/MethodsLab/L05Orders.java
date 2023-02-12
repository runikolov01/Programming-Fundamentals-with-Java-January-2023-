package MethodsLab;

import java.util.Scanner;

public class L05Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        doOrder(product, quantity);
    }
    public static void doOrder(String product, int quantity){
        double price = 0;
        switch (product){
            case "coffee":
                price = 1.5;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
                break;
        }
        double total = quantity * price;
        System.out.printf("%.02f", total);
    }
}
