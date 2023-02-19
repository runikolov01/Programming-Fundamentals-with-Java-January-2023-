package MidExamLastYears;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//03. Inventory
public class Fifth03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> itemsList = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("Craft!")) {
            String[] inpArr = input.split(" - ");
            String[] tokens = input.split(" - ");
            String command = tokens[0];
            String item = tokens[1];

            if (command.equals("Collect")) {
                if (!itemsList.contains(item)) {
                    itemsList.add(item);
                }
            } else if (command.equals("Drop")) {
                if (itemsList.contains(item)) {
                    itemsList.remove(item);
                }
            } else if (command.equals("Combine")) {
                String[] splitted = item.split(":");
                String oldItem = splitted[0];
                String newItem = splitted[1];
                int index = itemsList.indexOf(oldItem);
                if (itemsList.contains(oldItem)) {
                    itemsList.add(newItem);
                }
            } else if (command.equals("Renew")) {
                if (itemsList.contains(item)) {
                    int index = itemsList.indexOf(item);
                    itemsList.remove(item);
                    itemsList.add(item);
                }
            }

            input = scan.nextLine();
        }

        System.out.println(String.join(", ", itemsList));

    }
}
