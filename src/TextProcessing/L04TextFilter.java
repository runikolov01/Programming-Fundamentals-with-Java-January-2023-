package TextProcessing;

import java.util.Scanner;

public class L04TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] banWordsArr = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (String banWord : banWordsArr) {
            String asterisk = repeatString(banWord.length());
            text = text.replace(banWord, asterisk);
        }
        System.out.println(text);
    }

    public static String repeatString(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += "*";
        }
        return result;
    }
}
