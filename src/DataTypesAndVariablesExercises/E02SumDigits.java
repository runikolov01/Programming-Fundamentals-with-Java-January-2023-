package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class E02SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int lastDigit = 0;

        while(num>0){
            lastDigit = num % 10;
            sum += lastDigit;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
