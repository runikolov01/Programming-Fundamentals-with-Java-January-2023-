package BasicSyntax;

import java.util.Scanner;

public class L13RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i <= 2 * n; i++) {
            if(i%2!=0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.printf("Sum: %d%n", sum);

    }
}
