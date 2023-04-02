package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EEE02DestinationMapper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //16:51 - start
        //17:06 - finish
        // => 15 minutes

        String text = scan.nextLine();
        String regex = "(=|\\/)(?<word>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int totalSum = 0;
        List<String> list = new ArrayList<>();

        while (matcher.find()) {
            String currentWord = matcher.group("word");
            int length = currentWord.length();
            list.add(currentWord);
            totalSum += length;
        }

        System.out.printf("Destinations: ");
        System.out.println(String.join(", ", list));
        System.out.println("Travel Points: " + totalSum);
    }
}
