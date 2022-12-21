package BasicSyntaxExercises;

import java.util.Scanner;

public class E06StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int fnum = 1;
        int sum = 0;
        String numString = Integer.toString(num);
        int length = numString.length() - 1;
        char current = '1';
        int currentDigit = 0;

        for (int i = 0; i <= length; i++) {
            fnum = 1;
            current = numString.charAt(i);
            currentDigit = Character.getNumericValue(current);
            for (int b = 1; b <= currentDigit; b++) {
                fnum *= b;
            }
            sum += fnum;
        }
        if(num==sum){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        scan.close();
    }
}