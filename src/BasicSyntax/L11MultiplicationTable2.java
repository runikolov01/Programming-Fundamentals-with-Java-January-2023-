package BasicSyntax;

import java.util.Scanner;

public class L11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int result = 0;
        if(b > 10){
            result = a * b;
            System.out.printf("%d X %d = %d%n", a, b, result);
        }
        else {
            for (int i = b; i <= 10; i++) {
                result = a * i;
                System.out.printf("%d X %d = %d%n", a, i, result);
            }
        }
    }
}
