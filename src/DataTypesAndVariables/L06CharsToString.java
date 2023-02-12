package DataTypesAndVariables;

import java.util.Scanner;

public class L06CharsToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char first = scan.nextLine().charAt(0);
        char second = scan.nextLine().charAt(0);
        char third = scan.nextLine().charAt(0);

        String word = String.format("%s%s%s", first, second, third);

        System.out.println(word);


    }
}
