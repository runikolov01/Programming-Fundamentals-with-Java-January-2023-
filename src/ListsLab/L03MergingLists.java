package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L03MergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        int firstLength = firstList.size();
        int secondLength = secondList.size();
        int minLength = Math.min(firstLength, secondLength);

        for (int i = 0; i < minLength; i++) {
            int currentNumFirstList = firstList.get(i);
            int currentNumSecondList = secondList.get(i);
                resultList.add(currentNumFirstList);
                resultList.add(currentNumSecondList);
        }
        if(firstLength > secondLength){
            resultList.addAll(firstList.subList(minLength, firstLength));
        }
        else if(secondLength > firstLength){
            resultList.addAll(secondList.subList(minLength, secondLength));
        }
        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }
}
