package FinalExamPreparation;

import java.util.*;

public class EEE03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Start: 17:16
        //Finish:
        //Total:

        int number = Integer.parseInt(scan.nextLine());

        HashMap<String, Integer> plantsMap = new HashMap<>();
        HashMap<String, List<Double>> ratingsMap = new HashMap<>();

        for (int i = 0; i < number; i++) {
            String[] inpArr = scan.nextLine().split("<->");
            String plant = inpArr[0];
            int rarity = Integer.parseInt(inpArr[1]);

            plantsMap.put(plant, rarity);
            ratingsMap.putIfAbsent(plant, new ArrayList<>());
        }

        String input = scan.nextLine();

        while (!input.equals("Exhibition")) {
            String[] inpArr = input.split(": ");
            String command = inpArr[0];
            if (command.equals("Rate")) {
                String[] newArr = inpArr[1].split(" - ");
                String givenPlant = newArr[0];
                if (ratingsMap.containsKey(givenPlant)) {
                    double rating = Double.parseDouble(newArr[1]);
                    ratingsMap.get(givenPlant).add(rating);
                } else {
                    System.out.println("error");
                }
            } else if (command.equals("Update")) {
                String[] newArr = inpArr[1].split(" - ");
                String givenPlant = newArr[0];
                if (plantsMap.containsKey(givenPlant)) {
                    int newRarity = Integer.parseInt(newArr[1]);
                    plantsMap.put(givenPlant, newRarity);
                } else {
                    System.out.println("error");
                }
            } else if (command.equals("Reset")) {
                String[] newArr = inpArr[1].split(" - ");
                String givenPlant = newArr[0];
                if (ratingsMap.containsKey(givenPlant)) {
                    ratingsMap.get(givenPlant).clear();
                } else {
                    System.out.println("error");
                }
            }


            input = scan.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : plantsMap.entrySet()) {
            String plant = entry.getKey();
            int rarity = entry.getValue();
            double averageRating = ratingsMap.get(plant).stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            System.out.println(String.format("- %s; Rarity: %d; Rating: %.2f", plant, rarity, averageRating));
        }
    }
}
