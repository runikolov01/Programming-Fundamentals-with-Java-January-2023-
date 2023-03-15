package RegularExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L02MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String regex = "\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> matchedList = new ArrayList<>();

        while (matcher.find()) {
            matchedList.add(matcher.group());
        }
        System.out.print(String.join(", ", matchedList));
    }
}
