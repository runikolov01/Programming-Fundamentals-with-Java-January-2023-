package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EE02MirrorWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String regex = "(#|@)(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // proverka koq dvoika dumi e validna
        List<String> validPairs = new ArrayList<>();
        int countAllPairs = 0;

        while (matcher.find()) {
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");
            countAllPairs++;
            String secondWordReversed = new StringBuilder(secondWord).reverse().toString();

            if (firstWord.equals(secondWordReversed)) {
                //valid pair -> {first} <=> {second}
                validPairs.add(firstWord + " <=> " + secondWord);


            }
        }


        if (countAllPairs == 0) {  //ako nqma namereni dvoiki
            System.out.println("No word pairs found!");
        }
        else{
            System.out.println(countAllPairs + " word pairs found!");
        }

        //otp samo validnite dvoiki
        if(validPairs.size()==0){ // ako nqma
            System.out.println("No mirror words!");
        }
        else{ //ima validni dvoki
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", validPairs));
        }
    }
}
