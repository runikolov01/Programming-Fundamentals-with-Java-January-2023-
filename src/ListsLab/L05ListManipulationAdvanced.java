package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scan.nextLine();

        while (!input.equals("end")) {
            String[] inpArr = input.split(" ");
            String command = inpArr[0];
            String secondCommand = inpArr[1];
            if (command.equals("Contains")) {
                int number = Integer.parseInt(inpArr[1]);
                checkIfContains(numList, number);
            } else if ((command.equals("Print") && secondCommand.equals("even"))) {
                printEven(numList);
            } else if ((command.equals("Print") && secondCommand.equals("odd"))) {
                printOdd(numList);
            } else if (command.equals("Get") && secondCommand.equals("sum")) {
                getSum(numList);
            } else if (command.equals("Filter")) {
                String condition = inpArr[1];
                int num = Integer.parseInt(inpArr[2]);
                filterBy(numList, condition, num);
            }

            input = scan.nextLine();
        }


    }

    public static void checkIfContains(List numList, int number) {
        if (numList.contains(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    public static void printEven(List numList) {
        for (int i = 0; i < numList.size(); i++) {
            int current = (int) numList.get(i);
            if (current % 2 == 0) {
                System.out.printf("%d ", current);
            }
        }
        System.out.println();
    }

    public static void printOdd(List numList) {
        for (int i = 0; i < numList.size(); i++) {
            int current = (int) numList.get(i);
            if (current % 2 == 1) {
                System.out.printf("%d ", current);
            }
        }
        System.out.println();
    }

    public static void getSum(List numList) {
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            int current = (int) numList.get(i);
            sum += current;
        }
        System.out.println(sum);
    }

    public static void filterBy(List numList, String condition, int num) {
        switch (condition) {
            case ">":
                for (int i = 0; i < numList.size(); i++) {
                    int current = (int) numList.get(i);
                    if (current > num) {
                        System.out.printf("%d ", current);
                    }
                }
                System.out.println();
                break;
            case "<":
                for (int i = 0; i < numList.size(); i++) {
                    int current = (int) numList.get(i);
                    if (current < num) {
                        System.out.printf("%d ", current);
                    }
                }
                System.out.println();
                break;
            case ">=":
                for (int i = 0; i < numList.size(); i++) {
                    int current = (int) numList.get(i);
                    if (current >= num) {
                        System.out.printf("%d ", current);
                    }
                }
                System.out.println();
                break;
            case "<=":
                for (int i = 0; i < numList.size(); i++) {
                    int current = (int) numList.get(i);
                    if (current <= num) {
                        System.out.printf("%d ", current);
                    }
                }
                System.out.println();
                break;

        }
    }
}
