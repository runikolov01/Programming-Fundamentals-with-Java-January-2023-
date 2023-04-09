package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FE02BossRush {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < number; i++) {
            String text = scan.nextLine();
            String regex = "([\\\\|])(?<bossName>[A-Z]{4,})([\\\\|])([:])([#])(?<firstTitle>[A-Za-z]+) (?<secondTitle>[A-Za-z]+)([#])";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                String bossName = matcher.group("bossName");
                String firstTitle = matcher.group("firstTitle");
                String secondTitle = matcher.group("secondTitle");
                System.out.println(bossName + ", The " + firstTitle + " " + secondTitle);
                int lengthName = bossName.length();
                int lengthFirstTitile = firstTitle.length();
                int lengthSecondTitle = secondTitle.length();
                int totalTitleLength = 1 + lengthFirstTitile + lengthSecondTitle;
                System.out.println(">> Strength: " + lengthName);
                System.out.println(">> Armor: " + totalTitleLength);
            } else {
                System.out.println("Access denied!");
            }
        }
    }
}
