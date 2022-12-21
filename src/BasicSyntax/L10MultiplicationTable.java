package BasicSyntax;

import java.util.Scanner;

public class L10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int result = 0;
        int times = 1;
        while(times<=10){
            result = times * n;
            System.out.printf("%d X %d = %d%n",n,times, result);
            times++;
        }
    }
}
