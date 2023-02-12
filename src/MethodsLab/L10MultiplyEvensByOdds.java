package MethodsLab;

import java.util.Scanner;

public class L10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        int[] numArr = new int[num.length()];
        for(int i = 0; i < numArr.length; i++){
            int current = num.charAt(i);
            int numCurrent = 0;
            switch (current){
                case 48:
                    numCurrent = 0;
                    break;
                case 49:
                    numCurrent = 1;
                    break;
                case 50:
                    numCurrent = 2;
                    break;
                case 51:
                    numCurrent = 3;
                    break;
                case 52:
                    numCurrent = 4;
                    break;
                case 53:
                    numCurrent = 5;
                    break;
                case 54:
                    numCurrent = 6;
                    break;
                case 55:
                    numCurrent = 7;
                    break;
                case 56:
                    numCurrent = 8;
                    break;
                case 57:
                    numCurrent = 9;
                    break;
            }
            numArr[i] = numCurrent;
        }

        int sumEven = 0;
        int sumOdd = 0;

        for(int i = 0; i < numArr.length; i++){
            if(numArr[i]%2==0){
                sumEven += numArr[i];
            }
            else{
                sumOdd += numArr[i];
            }
        }
        int result = sumEven * sumOdd;

        System.out.println(result);
    }
}
