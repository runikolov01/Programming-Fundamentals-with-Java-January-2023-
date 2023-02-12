package DataTypesAndVariables;

import java.util.Scanner;

public class L05ConcatName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String second = scan.nextLine();
        String del = scan.nextLine();
        System.out.printf("%s%s%s", first, del, second);
    }
}
