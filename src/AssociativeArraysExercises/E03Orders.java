package AssociativeArraysExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E03Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        LinkedHashMap<String, Integer> quantityMap = new LinkedHashMap<>();
        LinkedHashMap<String, Double> pricesMap = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String[] arr = input.split(" ");
            String name = arr[0];
            double price = Double.parseDouble(arr[1]);
            int quantity = Integer.parseInt(arr[2]);

            if (!quantityMap.containsKey(name)) {
                quantityMap.put(name, quantity);
                pricesMap.put(name, price);
            } else {
                quantityMap.put(name, quantityMap.get(name) + quantity);
                pricesMap.put(name, price);
            }

            input = scan.nextLine();
        }

        for (Map.Entry<String, Integer> quant : quantityMap.entrySet()) {
            for (Map.Entry<String, Double> pr : pricesMap.entrySet()) {
                double currentTotalPrice = quant.getValue() * pr.getValue();
                if (quant.getKey().equals(pr.getKey())) {
                    System.out.printf("%s -> %.02f%n", quant.getKey(), currentTotalPrice);
                }
            }
        }
    }
}
