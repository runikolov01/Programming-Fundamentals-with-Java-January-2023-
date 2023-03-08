package AssociativeArraysExercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class E02AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, Integer> minerMap = new LinkedHashMap<>();
        String input = scan.nextLine();

        while (!input.equals("stop")) {
            String resource = input;
            String quantity = scan.nextLine();

            if (minerMap.containsKey(resource)) {
                int added = Integer.parseInt(quantity);
                minerMap.put(resource, minerMap.get(resource) + added);
            } else {
                minerMap.put(resource, Integer.parseInt(quantity));
            }
            input = scan.nextLine();
        }

        minerMap.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
