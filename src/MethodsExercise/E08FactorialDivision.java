package MethodsExercise;

import java.util.Scanner;

public class E08FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());

        double firstFactoriel = findFirstFactoriel(first);
        double secondFactoriel = findSecondFactoriel(second);
        double result = findResult(firstFactoriel, secondFactoriel);
        System.out.printf("%.02f", result);
    }

    public static double findFirstFactoriel(int first) {
        double firstFactoriel = 1;
        double secondFactoriel = 1;

        for (int i = first; i > 0; i--) {
            firstFactoriel *= i;
        }
        return firstFactoriel;
    }

    public static double findSecondFactoriel(int second) {
        double firstFactoriel = 1;
        double secondFactoriel = 1;

        for (int k = second; k > 0; k--) {
            secondFactoriel *= k;
        }
        return secondFactoriel;
    }

    public static double findResult(double firstFactoriel, double secondFactoriel) {
        double result = firstFactoriel / secondFactoriel;
        return result;
    }
}
