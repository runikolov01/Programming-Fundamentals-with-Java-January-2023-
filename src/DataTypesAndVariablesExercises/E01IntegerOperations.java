package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class E01IntegerOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        int d = Integer.parseInt(scan.nextLine());

        int num1 = a + b;
        int num2 = num1 / c;
        int num3 = num2 * d;

        System.out.println(num3);

    }
}
