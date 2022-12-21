package BasicSyntaxExercises;

import java.util.Scanner;

public class E07VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double coin = 0;
        double sum = 0;
        double nuts = 2;
        double water = 0.7;
        double crisps = 1.5;
        double soda = 0.8;
        double coke = 1.0;
        String command = scan.nextLine();
        double leftMoney = 0;

        while(!command.equals("Start")){
            coin = Double.parseDouble(command);
            if(coin==0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2 ){
            sum += coin;
            command = scan.nextLine();
        }
            else{
                System.out.printf("Cannot accept %.02f%n", coin);
                command = scan.nextLine();
            }
        }
        String product = scan.nextLine();
        leftMoney = sum;

        while(!product.equals("End")){
                switch (product){
                    case "Nuts":
                        if(leftMoney>=nuts) {
                            leftMoney -= nuts;
                            System.out.printf("Purchased %s%n", product);
                            break;
                        }
                        else {
                            System.out.println("Sorry, not enough money");
                            break;
                        }
                    case "Water":
                        if(leftMoney>=water) {
                            leftMoney -= water;
                            System.out.printf("Purchased %s%n", product);
                            break;
                        }
                        else{
                            System.out.println("Sorry, not enough money");
                            break;
                        }
                    case "Crisps":
                        if(leftMoney>=crisps) {
                            leftMoney -= crisps;
                            System.out.printf("Purchased %s%n", product);
                            break;

                        }
                        else{
                            System.out.println("Sorry, not enough money");
                            break;
                        }
                    case "Soda":
                        if(leftMoney>=soda) {
                            leftMoney -= soda;
                            System.out.printf("Purchased %s%n", product);
                            break;
                        }
                        else{
                            System.out.println("Sorry, not enough money");
                            break;
                        }
                    case "Coke":
                        if(leftMoney>=coke) {
                            leftMoney -= coke;
                            System.out.printf("Purchased %s%n", product);
                            break;
                        }
                        else{
                            System.out.println("Sorry, not enough money");
                            break;
                        }
                    default:
                        System.out.println("Invalid product");
                        break;
                }
                product = scan.nextLine();
            }
        System.out.printf("Change: %.02f", leftMoney);
    }
}
