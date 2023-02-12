package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class E07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numArrr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int longest = Integer.MIN_VALUE;
        int sumLongest = 0;
        int indexLongest = 0;
        int maxLongest = 0;

        for(int i = 0; i < numArrr.length; i++){
            int currentNum = numArrr[i];
            sumLongest = 0;
            for(int k = i+1; k < numArrr.length; k++){
                if(currentNum == numArrr[k]){
                    sumLongest += 1;
                    if(sumLongest > maxLongest){
                        maxLongest = sumLongest;
                        indexLongest = i;
                    }
                }
                else{
                    break;
                }
            }
        }
        for(int m = 0; m <= maxLongest; m++){
            System.out.printf("%d ", numArrr[indexLongest]);
        }
    }
}
