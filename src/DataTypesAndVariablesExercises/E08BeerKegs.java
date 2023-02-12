package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class E08BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double maxValue = Integer.MIN_VALUE;
        String bigger = "";

        for (int i = 1; i <= n; i++) {
            String model = scan.nextLine();
            double r = Double.parseDouble(scan.nextLine());
            int h = Integer.parseInt(scan.nextLine());
            double volume = Math.PI * r * r * h;
            if (volume > maxValue) {
                maxValue = volume;
                bigger = model;
            }
        }
        System.out.println(bigger);
    }
}
