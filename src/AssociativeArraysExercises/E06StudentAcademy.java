package AssociativeArraysExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E06StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String name = "";
        double grade = 0;
        LinkedHashMap<String, Double> studentsInfoMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            name = scan.nextLine();
            grade = Double.parseDouble(scan.nextLine());
            if (!studentsInfoMap.containsKey(name)) {
                studentsInfoMap.put(name, grade);
            } else {
                double averageGrade = (studentsInfoMap.get(name) + grade) / 2;
                studentsInfoMap.put(name, averageGrade);
            }
        }
        for (Map.Entry<String, Double> entry : studentsInfoMap.entrySet()) {
            if (entry.getValue() >= 4.50) {
                System.out.printf("%s -> %.02f%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
