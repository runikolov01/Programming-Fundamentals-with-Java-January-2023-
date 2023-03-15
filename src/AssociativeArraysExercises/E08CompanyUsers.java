package AssociativeArraysExercises;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class E08CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        LinkedHashMap<String, List<String>> map = new LinkedHashMap();
        while (!input.equals("End")) {
            String[] arr = input.split(" -> ");
            String companyName = arr[0];
            String id = arr[1];

            if (map.containsKey(companyName)) {
                boolean isExist = true;
                for (List<String> list : map.values()) {
                    if (list.contains(id)) {
                        isExist = false;
                    }
                }
                if (isExist) {
                    map.get(companyName).add(id);
                }
            } else {
                map.put(companyName, new ArrayList<>());
                map.get(companyName).add(id);
            }


            input = scan.nextLine();
        }

        map.entrySet().forEach(entry -> {
                    System.out.println(entry.getKey());
                    entry.getValue().forEach(id -> System.out.println("-- " + id));
                }

        );

    }
}
