package ListExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E03HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> goingNamesList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String[] inpArr = input.split(" ");
            String name = inpArr[0];
            if (inpArr[2].equals("not")) {
                if (goingNamesList.contains(name)) {
                    goingNamesList.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }

            } else if (inpArr[2].equals("going!")) {
                if (!goingNamesList.contains(name)) {
                    goingNamesList.add(name);
                } else {
                    System.out.printf("%s is already in the list!%n", name);
                }
            }
        }
        for (String element:goingNamesList) {
            System.out.println(element);
        }
    }
}
