package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] inpArr = input.split(" ");
            String command = inpArr[0];
            int number = Integer.parseInt(inpArr[1]);

            if (command.equals("Delete")) {
                numbersList.removeAll(Arrays.asList(number));
            } else if (command.equals("Insert")) {
                int position = Integer.parseInt(inpArr[2]);
                 numbersList.add(position, number);
            }
            input = scan.nextLine();
        }
        for (int num: numbersList) {
            System.out.print(num + " ");
        }
    }

}
