package AssociativeArrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class L01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] numbersArr = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double, Integer> countMap = new TreeMap<>();

        for(double num:numbersArr){
            if(!countMap.containsKey(num)){
                countMap.put(num, 1);
            }
            else{
                int currentValue = countMap.get(num);
                countMap.put(num, currentValue+1);
            }
        }

        for(Map.Entry<Double, Integer> entry : countMap.entrySet()){
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
