package ArraysExercises;

import java.util.Scanner;

public class E04ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array = scan.nextLine().split(" ");
        int num = Integer.parseInt(scan.nextLine());

        for(int i = 0; i <num; i++){
            String temp = array[0];
            for(int k = 0; k < array.length; k++){
                if(k!=array.length-1) {
                    array[k] = array[k + 1];
                }
                else{
                    array[k] = temp;
                }
            }
        }
        for(int m = 0; m < array.length; m++){
            System.out.printf("%s ", array[m]);
        }
    }
}
