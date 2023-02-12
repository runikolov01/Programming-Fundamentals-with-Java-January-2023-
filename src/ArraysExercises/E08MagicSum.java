package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class E08MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int num = Integer.parseInt(scan.nextLine());

        for(int i = 0; i < numArr.length; i++){
            int currentNum = numArr[i];
            for(int m = i+1; m<numArr.length; m++){
                int nextNum = numArr[m];
                if(currentNum + nextNum == num){
                    System.out.printf("%d %d", currentNum, nextNum);
                    System.out.println();
                }
            }
        }
    }
}
