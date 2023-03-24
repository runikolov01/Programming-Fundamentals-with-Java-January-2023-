package TextProcessing;

import java.util.Scanner;

public class L03Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String toRemove = scan.nextLine();
        String text = scan.nextLine();

        int index = text.indexOf(toRemove);

        while (index != -1) {
            text = text.replaceAll(toRemove, "");
            index = text.indexOf(toRemove);
        }
        System.out.println(text);
    }

    public static class E04CaesarCipher {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String text = scan.nextLine();
            StringBuilder encryptedText = new StringBuilder();

            for (char symbol : text.toCharArray()) {
                char encryptSymbol = (char) (symbol + 3);
                encryptedText.append(encryptSymbol);
            }
            System.out.println(encryptedText);
        }
    }
}
