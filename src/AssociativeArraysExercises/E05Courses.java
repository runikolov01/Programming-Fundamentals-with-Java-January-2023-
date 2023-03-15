package AssociativeArraysExercises;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E05Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String[] arr = input.split(" : ");
            String courseName = arr[0];
            String studentName = arr[1];

            if (map.containsKey(courseName)) {
                map.get(courseName).add(studentName);
            } else {
                map.put(courseName, new ArrayList<>());
                map.get(courseName).add(studentName);
            }
            input = scan.nextLine();
        }

        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
        });

    }
}
