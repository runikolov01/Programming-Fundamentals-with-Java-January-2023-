package FinalExam;

import java.util.*;

public class FE03WildZoo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, Integer> animalDailyFoodMap = new LinkedHashMap<>();
        LinkedHashMap<String, String> animalLivingAreaMap = new LinkedHashMap<>();

        String input = scan.nextLine();

        while (!input.equals("EndDay")) {
            String[] arr = input.split(": ");
            String command = arr[0];
            String[] secondArr = arr[1].split("-");

            if (command.equals("Add")) {
                String animalName = secondArr[0];
                int neededFood = Integer.parseInt(secondArr[1]);
                String area = secondArr[2];
                if (animalDailyFoodMap.containsKey(animalName) && animalLivingAreaMap.containsKey(animalName)) {
                    int newNeededFood = animalDailyFoodMap.get(animalName) + neededFood;
                    animalDailyFoodMap.put(animalName, newNeededFood);
                } else {
                    animalDailyFoodMap.put(animalName, neededFood);
                    animalLivingAreaMap.put(animalName, area);
                }
            } else if (command.equals("Feed")) {
                String animalName = secondArr[0];
                int food = Integer.parseInt(secondArr[1]);
                if (animalDailyFoodMap.containsKey(animalName) && animalLivingAreaMap.containsKey(animalName)) {
                    int newNeededFood = animalDailyFoodMap.get(animalName) - food;
                    animalDailyFoodMap.put(animalName, newNeededFood);

                    if (animalDailyFoodMap.get(animalName) <= 0) {
                        animalDailyFoodMap.remove(animalName);
                        animalLivingAreaMap.remove(animalName);
                        System.out.println(animalName + " was successfully fed");
                    }
                }
            }


            input = scan.nextLine();
        }

        System.out.println("Animals:");
        for (Map.Entry<String, Integer> entry : animalDailyFoodMap.entrySet()) {
            System.out.println(" " + entry.getKey() + " -> " + entry.getValue() + "g");
        }

        List<String> areasList = new ArrayList<>();
        for (Map.Entry<String, String> entry : animalLivingAreaMap.entrySet()) {
            areasList.add(entry.getValue());
        }

        LinkedHashMap<String, Integer> areaNumberHungryMap = new LinkedHashMap<>();

        for (int i = 0; i < areasList.size(); i++) {
            if (!areaNumberHungryMap.containsKey(areasList.get(i))) {
                areaNumberHungryMap.put(areasList.get(i), 1);
            } else {
                int newNum = areaNumberHungryMap.get(areasList.get(i)) + 1;
                areaNumberHungryMap.put(areasList.get(i), newNum);
            }
        }

        System.out.println("Areas with hungry animals:");
        for (Map.Entry<String, Integer> entry : areaNumberHungryMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
