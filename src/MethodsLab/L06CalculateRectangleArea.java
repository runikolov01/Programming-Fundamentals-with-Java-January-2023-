package MethodsLab;

import java.util.Scanner;

public class L06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int widthInput = Integer.parseInt(scan.nextLine());
        int lengthInput = Integer.parseInt(scan.nextLine());

        int area = calculateArea(widthInput, lengthInput);
        System.out.println(area);
    }

    public static int calculateArea(int width, int length){
        return width * length;
    }
}