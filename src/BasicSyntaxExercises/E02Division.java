package BasicSyntaxExercises;

import java.util.Scanner;

public class E02Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int number = 0;
        if(num%10==0){
            number = 10;
        }
        else if(num%7==0){
            number = 7;
        }
        else if(num%6==0){
            number = 6;
        }
        else if(num%3==0){
            number = 3;
        }
        else if(num%2==0){
            number = 2;
        }
        else{
            System.out.println("Not divisible");
        }
        if(num%2==0 || num%3==0 || num%6==0 || num%7==0 || num%10==0) {
            System.out.printf("The number is divisible by %d", number);
        }
        scan.close();
    }
}
