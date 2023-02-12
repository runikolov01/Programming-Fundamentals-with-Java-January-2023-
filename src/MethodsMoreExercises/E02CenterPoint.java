package MethodsMoreExercises;

import java.util.Scanner;

public class E02CenterPoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = Integer.parseInt(scan.nextLine());
        int y1 = Integer.parseInt(scan.nextLine());
        int x2 = Integer.parseInt(scan.nextLine());
        int y2 = Integer.parseInt(scan.nextLine());

        System.out.println("(" + closestToCenterCheck(x1, y1, x2, y2) + ")");

    }

    static String closestToCenterCheck(int x1, int y1, int x2, int y2) {

        String closest = "";

        int firstPoint = Math.abs(x1) + Math.abs(y1);
        int secondPoint = Math.abs(x2) + Math.abs(y2);


        if (firstPoint < secondPoint) {
            closest += x1 + ", " + y1;
        } else if (firstPoint > secondPoint) {
            closest += x2 + ", " + y2;
        } else {
            closest += x1 + ", " + y1;
        }

        return closest;
    }
}
