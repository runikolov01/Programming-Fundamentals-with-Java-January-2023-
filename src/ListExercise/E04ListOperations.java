package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E04ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] inpArr = input.split(" ");
            String operator = inpArr[0];
            switch (operator) {
                case "Add":
                    int number = Integer.parseInt(inpArr[1]);
                    numbersList.add(number);
                    break;
                case "Insert":
                    int num = Integer.parseInt(inpArr[1]);
                    int index = Integer.parseInt(inpArr[2]);
                    if (index <= numbersList.size()-1 && index >= 0) {
                        numbersList.add(index, num);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int n = Integer.parseInt(inpArr[1]);
                    if (n <= numbersList.size()-1 && n >=0) {
                        numbersList.remove(n);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String secondOp = inpArr[1];
                    int count = Integer.parseInt(inpArr[2]);
                    if (secondOp.equals("left")) {
                        for (int counter = 1; counter <= count; counter++) {
                            int firstNumber = numbersList.get(0);
                            numbersList.add(firstNumber);
                            numbersList.remove(0);
                        }
                    } else if (secondOp.equals("right")) {
                        for (int counter = 1; counter <= count; counter++) {
                            int lastNumber = numbersList.get(numbersList.size() - 1);
                            numbersList.add(0, lastNumber);
                            numbersList.remove(numbersList.size() - 1);
                        }
                    }
                    break;
                default:
                    break;
            }
            input = scan.nextLine();
        }
        for (int element:numbersList) {
            System.out.printf("%d ", element);
        }
    }
}
