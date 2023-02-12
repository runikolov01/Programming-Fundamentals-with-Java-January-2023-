package MethodsExercise;

import java.util.Scanner;

public class E06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int length = input.length();
        int sredenIndex = 0;
        int sredenIndex2 = 0;

        if(length%2 == 1){
            sredenIndex = length / 2;
            char current = input.charAt(sredenIndex);
            System.out.println(current);
        }
        else{
            sredenIndex = length / 2;
            sredenIndex2 = sredenIndex - 1;
            char current = input.charAt(sredenIndex);
            char second = input.charAt(sredenIndex2);
            System.out.printf("%c%c", second, current);
        }

    }
}
