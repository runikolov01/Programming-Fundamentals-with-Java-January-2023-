package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E06CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> firstPlayer = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < firstPlayer.size(); i++) {
            if (firstPlayer.size() == 0 || secondPlayer.size() == 0) {
               i = firstPlayer.size();
               break;
            }
            int currentFirst = firstPlayer.get(i);
            int currentSecond = secondPlayer.get(i);

            if (currentFirst > currentSecond) {
                firstPlayer.add(currentFirst);
                firstPlayer.add(currentSecond);
                firstPlayer.remove(i);
                secondPlayer.remove(i);
                i = -1;
            } else if (currentFirst < currentSecond) {
                secondPlayer.add(currentSecond);
                secondPlayer.add(currentFirst);
                firstPlayer.remove(i);
                secondPlayer.remove(i);
                i = -1;
            } else {
                firstPlayer.remove(i);
                secondPlayer.remove(i);
                i = -1;
            }
        }
        int sum = 0;
        if (firstPlayer.size() > secondPlayer.size()) {
            for (int i = 0; i < firstPlayer.size(); i++) {
                int current = firstPlayer.get(i);
                sum += current;
            }
            System.out.printf("First player wins! Sum: " + sum);
        } else if (secondPlayer.size() > firstPlayer.size()) {
            for (int i = 0; i < secondPlayer.size(); i++) {
                int current = secondPlayer.get(i);
                sum += current;
            }
            System.out.printf("Second player wins! Sum: " + sum);
        }
    }
}
