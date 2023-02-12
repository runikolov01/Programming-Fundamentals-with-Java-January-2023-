package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class E09ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //•	"decrease" decreases all elements in the array with 1.

        String command = scan.nextLine();
        while (!command.equals("end")) {
                String[] comArr = command.split(" ");
                if(comArr[0].equals("swap")){
                    String index1 = comArr[1];
                    String index2 = comArr[2];
                    int firstIndex = Integer.parseInt(index1);
                    int secondIndex = Integer.parseInt(index2);
                    int temp = numArr[firstIndex];
                    numArr[firstIndex] = numArr[secondIndex];
                    numArr[secondIndex] = temp;
                }
                else if(comArr[0].equals("multiply")){
                    String index1 = comArr[1];
                    String index2 = comArr[2];
                    int firstIndex = Integer.parseInt(index1);
                    int secondIndex = Integer.parseInt(index2);
                    numArr[firstIndex] = numArr[firstIndex] * numArr[secondIndex];
                }
                else if(comArr[0].equals("decrease")){
                    for(int k = 0; k < numArr.length; k++){
                        numArr[k] -= 1;
                    }
                }

            command = scan.nextLine();
        }
        for(int i = 0; i < numArr.length; i++){
            if(i==numArr.length-1){
                System.out.printf("%d", numArr[i]);
            }
            else {
                System.out.printf("%d, ", numArr[i]);
            }
        }
        }
}
