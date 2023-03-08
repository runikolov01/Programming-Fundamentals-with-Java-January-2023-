package AssociativeArraysExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E01CountChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char item : input.toCharArray()) {
            if (item == ' ') {
                continue;
            }
            if (!map.containsKey(item)) {
                map.put(item, 0);
            }
            map.put(item, map.get(item) + 1);
        }

        map.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
