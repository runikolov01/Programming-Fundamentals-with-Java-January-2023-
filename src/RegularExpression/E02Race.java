package RegularExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class E02Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameParticipants = scan.nextLine();
        List<String> participantsList = Arrays.stream(nameParticipants.split(", ")).toList();

        String input = scan.nextLine();

        while(!input.equals("end of race")){

            input = scan.nextLine();
        }

    }
}
