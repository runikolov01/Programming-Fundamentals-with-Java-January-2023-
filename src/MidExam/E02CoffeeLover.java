package MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02CoffeeLover {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> coffeeList = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        int numberOfCommands = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= numberOfCommands; i++) {
            String[] input = scan.nextLine().split(" ");
            String command = input[0];
            switch (command) {
                case "Include":
                    String coffee = input[1];
                    coffeeList.add(coffee);
                    break;
                case "Remove":
                    String type = input[1];
                    String num = input[2];
                    int number = Integer.parseInt(num);
                    if (type.equals("first")) {
                        for (int k = 0; k < number; k++) {
                            coffeeList.remove(0);
                        }
                    } else if (type.equals("last")) {
                        for (int j = 0; j < number; j++) {
                            int length = coffeeList.size();
                            coffeeList.remove(length - 1);
                        }
                    }
                    break;
                case "Prefer":
                    String first = input[1];
                    String second = input[2];
                    int firstIndex = Integer.parseInt(first);
                    int secondIndex = Integer.parseInt(second);
                    int totalIndexes = coffeeList.size() - 1;
                    if (firstIndex <= totalIndexes && secondIndex <= totalIndexes) {
                        String firstCoffee = coffeeList.get(firstIndex);
                        String secondCoffee = coffeeList.get(secondIndex);
                        firstCoffee = coffeeList.set(firstIndex, secondCoffee);
                        secondCoffee = coffeeList.set(secondIndex, firstCoffee);
                    }
                    break;
                case "Reverse":
                    Collections.reverse(coffeeList);
                    break;
            }
        }

        System.out.println("Coffees:");
        System.out.println(String.join(" ", coffeeList));

    }
}
