package ArraysExercises;

import java.util.Scanner;

public class E02CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] firstArr = scan.nextLine().split(" ");
        String[] secondArr = scan.nextLine().split(" ");

        int m = 0;
        int firstLength = firstArr.length;
        int secondLength = secondArr.length;

        int counter = 0;
        for(int i = 0; i < secondLength; i ++){
            String secondCurrent = secondArr[i];
            for(int k = 0; k < firstLength; k++){
                String firstCurrent = firstArr[k];
                if(firstCurrent.equals(secondCurrent)){
                    counter++;
                }
            }
        }
        String[] newArr = new String[counter];
        for(int newI = 0; newI < secondLength; newI ++){
            String secondCurrent = secondArr[newI];
            for(int newK = 0; newK < firstLength; newK++){
                String firstCurrent = firstArr[newK];
                if(secondCurrent.equals(firstCurrent)){
                    newArr[m] = secondCurrent;
                    m++;
                }
            }
        }
        System.out.println(String.join(" ", newArr));
    }
}
