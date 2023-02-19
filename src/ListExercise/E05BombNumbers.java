package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// GRESHNA ZADACHA = JUDGE DAVA SAMO 25 T
public class E05BombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int[] bombArr = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int specialNum = bombArr[0];
        int power = bombArr[1];
        for (int i = 0; i < numbersList.size(); i++) {
            int currentNum = numbersList.get(i);
            if (currentNum == specialNum) {
                for (int counter = 1; counter <= power; counter++) {
                    // triene nadqsno ot specialNum
                    int index = i + 1;
                    if (index >= numbersList.size()) {
                        break;
                    } else {
                        numbersList.remove(index);
                    }
                }
                for (int counter = 1; counter <= power; counter++) {
                    //triene nalqvo ot specialNum
                    int index = i - counter;
                    if (index < 0) {
                        break;
                    } else {
                        numbersList.remove(index);
                    }
                }

            }
        }
        int sum = 0;

        for (int m = 0; m < numbersList.size(); m++) {
            int current = numbersList.get(m);
            if (current == specialNum) {
                numbersList.remove(m);
                m = -1;
            }

        }

        for (int l = 0; l < numbersList.size(); l++) {
            int cu = numbersList.get(l);
            sum += cu;
        }
        System.out.println(sum);
    }
}
