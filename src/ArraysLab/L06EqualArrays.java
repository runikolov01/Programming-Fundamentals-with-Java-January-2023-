package ArraysLab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class L06EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] firstArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean equal = true;
        int sum = 0;
        int firstLength = firstArr.length;
        int secondLength = secondArr.length;
        int min = 0;
        if(firstLength < secondLength){
            min = firstLength;
        }
        else{
            min = secondLength;
        }
        for(int i = 0; i < min; i++){
            if(firstArr[i] == secondArr[i]){
                sum += firstArr[i];
            }
            else{
                equal = false;
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
        }
        if(equal == true) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}