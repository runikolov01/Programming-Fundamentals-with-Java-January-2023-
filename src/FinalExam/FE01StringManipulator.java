package FinalExam;

import java.util.Locale;
import java.util.Scanner;

public class FE01StringManipulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        String input = scan.nextLine();

        while (!input.equals("End")) {
            String[] arr = input.split(" ");
            String command = arr[0];

            if (command.equals("Translate")) {
                String charInput = arr[1];
                String replacement = arr[2];
                String replacedText = text.replace(charInput, replacement);
                text = replacedText;
                System.out.println(text);
            } else if (command.equals("Includes")) {
                String substring = arr[1];
                if (text.contains(substring)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if (command.equals("Start")) {
                String substring = arr[1];
                if (text.startsWith(substring)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if (command.equals("Lowercase")) {
                text = text.toLowerCase(Locale.ROOT);
                System.out.println(text);
            } else if (command.equals("FindIndex")) {
                String charInput = arr[1];
                int index = text.lastIndexOf(charInput);
                System.out.println(index);
            } else if (command.equals("Remove")) {
                int startIndex = Integer.parseInt(arr[1]);
                int count = Integer.parseInt(arr[2]);
                StringBuilder sb = new StringBuilder(text);
                sb.replace(startIndex, startIndex + count, "");
                text = sb.toString();
                System.out.println(text);
            }

            input = scan.nextLine();
        }
    }
}
