package BasicSyntax;

import java.util.Scanner;

public class L09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for(int i = 1; i <= 2 * n; i++){
            if (i%2!=0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
