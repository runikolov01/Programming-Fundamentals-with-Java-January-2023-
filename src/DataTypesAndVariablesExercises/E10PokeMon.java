package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class E10PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine()); // n = poke power
        int m = Integer.parseInt(scan.nextLine()); // m = distance between the poke targets
        int y = Integer.parseInt(scan.nextLine()); // y = exhaustionFactor

        int counter = 0;
        int first = n;

        while (n >= m) {
            n -= m;
            counter += 1;
            if (n == first / 2 && y != 0) {
                if (y != 0) {
                    n = n / y;
                }
            }
        }
        System.out.println(n);
        System.out.println(counter);
    }
}
