package TextProcessing;

import java.util.Scanner;

public class E01ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        boolean flag = true;

        for (int i = 0; i < input.length; i++) {
            String currentUserName = input[i];
            if (currentUserName.length() >= 3 && currentUserName.length() <= 16) {
                flag = true;
                for (int k = 0; k < currentUserName.length(); k++) {
                    char currentLetter = currentUserName.charAt(k);
                    if (Character.isLetterOrDigit(currentLetter) || currentLetter == '-' || currentLetter == '_') {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(currentUserName);
                }
            }
        }
    }
}
