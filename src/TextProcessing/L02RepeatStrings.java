package TextProcessing;

import java.util.Scanner;

public class L02RepeatStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        String newText = "";

        for (int i = 0; i < arr.length; i++) {
            String currentText = arr[i];
            int currentTextLengthd = currentText.length();
            for (int j = 0; j < currentTextLengthd; j++) {
                newText += currentText;
            }
        }

        System.out.println(newText);
    }
}
