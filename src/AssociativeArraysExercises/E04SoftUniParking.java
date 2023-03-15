package AssociativeArraysExercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E04SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String[] arr = input.split("\\s+");
            String command = arr[0];

            if (command.equals("register")) {
                String username = arr[1];
                String number = arr[2];
                if (map.containsKey(username)) {
                    String currentNumber = map.get(username);
                    System.out.println("ERROR: already registered with plate number " + currentNumber);
                } else {
                    map.put(username, number);
                    System.out.println(username + " registered " + number + " successfully");
                }
            } else if (command.equals("unregister")) {
                String username = arr[1];
                if (map.containsKey(username)) {
                    map.remove(username);
                    System.out.println(username + " unregistered successfully");
                } else {
                    System.out.println("ERROR: user " + username + " not found");
                }
            }
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
