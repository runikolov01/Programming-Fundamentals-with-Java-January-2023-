package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05BombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] bombArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int specialNum = bombArr[0];
        int power = bombArr[1];
        for (int i = 0; i < numbersList.size(); i++) {
            int currentNum = numbersList.get(i);
            if (currentNum == specialNum) {
                //numbersList.remove(i);
                for (int counter = 1; counter <= power; counter++) {
                    int index = i+1;
                    if (index >= numbersList.size()) {
                        break;
                    } else {
                        numbersList.remove(index);
                    }
                }
                for (int counter = 1; counter <= power; counter++) {
                    int index = i - 1;
                    if (index < 0) {
                        break;
                    } else {
                        numbersList.remove(index);
                    }
                }

            }
        }
        int sum = 0;
       // System.out.println("Size: %n");
      //  System.out.println(numbersList.size());
      //  System.out.printf("Special num: %d%n", specialNum);
        for (int m = 0; m < numbersList.size(); m++) {
            int current = numbersList.get(m);
           // System.out.printf("Current num: %d%n", current);
            if (current == specialNum) {
                numbersList.remove(m);
                m = -1;
            }
                //System.out.println("Sum: ");
              //  System.out.println(sum);
            }

        for(int l = 0; l < numbersList.size(); l++){
            int cu = numbersList.get(l);
            sum += cu;
        }
    // System.out.println(numbersList);
        System.out.println(sum);
    }
}
