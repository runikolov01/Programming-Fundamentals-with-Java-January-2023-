package FinalExamPreparation;

import java.util.Locale;
import java.util.Scanner;

public class EEEEE01ActivationKeys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder activationKey = new StringBuilder(scan.nextLine());

        String input = scan.nextLine();
        while (!input.equals("Generate")) {
            String[] arr = input.split(">>>");
            String command = arr[0];

            if (command.equals("Contains")) {
                String substring = arr[1];
                String sbText = activationKey.toString();
                if (sbText.contains(substring)) {
                    System.out.println(activationKey + " conains " + substring);
                } else {
                    System.out.println("Substring not found!");
                }
            } else if (command.equals("Flip")) {
                String currentWord = arr[1];
                int startIndex = Integer.parseInt(arr[2]);
                int endIndex = Integer.parseInt(arr[3]);
                String text = "";
                if (currentWord.equals("Upper")) {
                    text = activationKey.substring(startIndex, endIndex).toUpperCase(Locale.ROOT);
                } else if (currentWord.equals("Lower")) {
                    text = activationKey.substring(startIndex, endIndex).toLowerCase(Locale.ROOT);
                }
                activationKey.replace(startIndex, endIndex, text);
                System.out.println(activationKey);
            } else if (command.equals("Slice")) {
                int startIndex = Integer.parseInt(arr[1]);
                int endIndex = Integer.parseInt(arr[2]);
                activationKey.delete(startIndex, endIndex);
                System.out.println(activationKey);
            }

            input = scan.nextLine();

        }

        System.out.println("Your activation key is: " + activationKey);
    }
}