package FinalExamPreparation;

import java.util.Scanner;

public class E01TheImitationGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String encryptedMessage = scan.nextLine();
        StringBuilder modifyMessage = new StringBuilder(encryptedMessage);
        String input = scan.nextLine();

        while (!input.equals("Decode")) {
            String[] arr = input.split("\\|");
            String command = arr[0];
            switch (command) {
                case "Move":
                    int number = Integer.parseInt(arr[1]);
                    String firstLetters = modifyMessage.substring(0, number);
                    modifyMessage.replace(0, number, "");
                    modifyMessage.append(firstLetters);
                    break;
                case "Insert":
                    int index = Integer.parseInt(arr[1]);
                    String value = arr[2];
                    modifyMessage.insert(index, value);
                    break;
                case "ChangeAll":
                    String substring = arr[1];
                    String replacement = arr[2];
                    String currentMessage = modifyMessage.toString();
                    currentMessage = currentMessage.replace(substring, replacement);
                    modifyMessage = new StringBuilder(currentMessage);
                    break;
            }

            input = scan.nextLine();
        }
        System.out.println("The decrypted message is: " + modifyMessage);

    }
}
