package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scan.nextLine();

        while(!input.equals("end")){
            String[] inputArray = input.split(" ");
            int num = Integer.parseInt(inputArray[1]);
            switch (inputArray[0]) {
                case "Add":
                    addNumberToTheEnd(numbersList, num);
                    break;
                case "Remove":
                    removeTheNumber(numbersList, num);
                    break;
                case "RemoveAt":
                    removeAtIndex(numbersList, num);
                    break;
                case "Insert":
                    int secondNum = Integer.parseInt(inputArray[2]);
                    insertAtIndex(numbersList,secondNum, num);
                    break;
            }


            input = scan.nextLine();
        }

        for (int element:numbersList) {
            System.out.printf("%d ", element);
        }
    }

    public static void addNumberToTheEnd(List numbersList, int num){
      numbersList.add(num);
    }

    public static void removeTheNumber(List numbersList, int num){
        numbersList.remove(Integer.valueOf(num));
    }

    public static void removeAtIndex(List numbersList, int num){
        numbersList.remove(num);
    }

    public static void insertAtIndex(List numbersList, int secondNum, int num){
        numbersList.add(secondNum, num);
    }
}
