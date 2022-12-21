package BasicSyntax;

import java.util.Scanner;

public class L12EvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int abs = 0;
        while(num%2!=0){
            System.out.println("Please write an even number.");
            num = Integer.parseInt(scan.nextLine());
        }
        if(num%2==0){
            abs = Math.abs(num);
            System.out.printf("The number is: %d", abs);
        }
    }
}
