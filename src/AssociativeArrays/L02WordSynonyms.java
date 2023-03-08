package AssociativeArrays;

import java.util.*;

public class L02WordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, ArrayList<String>> wordsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();

            if (!wordsMap.containsKey(word)) {
                wordsMap.put(word, new ArrayList());
            }
            wordsMap.get(word).add(synonym);

        }

        for (Map.Entry<String, ArrayList<String>> entry : wordsMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));

        }


    }
}
