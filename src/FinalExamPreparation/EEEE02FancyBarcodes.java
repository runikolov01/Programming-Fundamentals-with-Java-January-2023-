package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EEEE02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "(@)([#]+)(?<word>[A-Z][A-Za-z|0-9]{4,}[A-Z])";
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String text = scan.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                int counter = 0;
                String numberString = "";
                String word = matcher.group("word");
                for (int l = 0; l < word.length(); l++) {
                    char currentLetter = word.charAt(l);
                    if ((int) currentLetter >= 48 && (int) currentLetter <= 57) {
                        numberString += currentLetter;
                        counter += 1;
                    }
                }
                if (counter == 0) {
                    numberString = "00";
                }
                System.out.println("Product group: " + numberString);
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
