package AssociativeArrays;

import java.util.*;

public class L03OddOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");

        LinkedHashMap<String, Integer> mapWords = new LinkedHashMap<>();

        for (String item : arr) {
            String current = item.toLowerCase();
            mapWords.putIfAbsent(current, 0);
            mapWords.put(item, mapWords.get(item) + 1);
        }

        List<String> wordsList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : mapWords.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                wordsList.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", wordsList));
    }
}
