package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class E05Decrypting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int key = Integer.parseInt(scan.nextLine());
        int num = Integer.parseInt(scan.nextLine());

        String text = "";

        for (int i = 0; i < num; i++) {
            char input = scan.nextLine().charAt(0);
            int inputInt = input;
            int resultInt = inputInt + key;
            char letter = (char) resultInt;
            text += letter;
        }
        System.out.println(text);
    }
}
