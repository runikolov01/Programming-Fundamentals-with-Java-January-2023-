package TextProcessing;

import java.util.Scanner;

public class L01ReverseStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (!input.equals("end")) {
            String reversed = "";

            for (int i = input.length() - 1; i >= 0; i--) {
                char currentSymbol = input.charAt(i);
                reversed += currentSymbol;
            }
            System.out.println(input + " = " + reversed);
            input = scan.nextLine();
        }
    }
}
