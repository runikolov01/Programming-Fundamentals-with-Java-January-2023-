package TextProcessing;

import java.util.Scanner;

public class ME01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            int beginName = input.indexOf('@');
            int endName = input.indexOf('|');
            int beginAge = input.indexOf('#');
            int endAge = input.indexOf('*');
            System.out.printf(String.format("%s is %s years old.\n", input.substring(beginName + 1, endName), input.substring(beginAge + 1, endAge)));
        }
    }
}
