package FinalExamPreparation;

import java.util.Scanner;

public class EEEE01PasswordReset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        String input = scan.nextLine();

        while (!input.equals("Done")) {
            String[] arr = input.split("\\s+");
            String command = arr[0];

            if (command.equals("TakeOdd")) {
                String word = "";
                for (int i = 1; i < text.length(); i += 2) {
                        char currentChar = text.charAt(i);
                        word += currentChar;
                }
                text = word;
                System.out.println(text);
            } else if (command.equals("Cut")) {
                int index = Integer.parseInt(arr[1]);
                int length = Integer.parseInt(arr[2]);
                String newText = text.substring(index, index + length);
                String againNewText = text.replaceFirst(newText, "");
                text = againNewText;
                System.out.println(text);
            } else if (command.equals("Substitute")) {
                String substring = arr[1];
                if (text.contains(substring)) {
                    String substitute = arr[2];
                    String newText = text.replace(substring, substitute);
                    text = newText;
                    System.out.println(text);
                } else {
                    System.out.println("Nothing to replace!");
                }


            }
            input = scan.nextLine();
        }

        System.out.println("Your password is: " + text);
    }
}