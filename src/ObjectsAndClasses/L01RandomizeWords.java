package ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class L01RandomizeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] inpArr = input.split(" ");

        Random rndGen = new Random();

        for (int i = 0; i < inpArr.length; i++) {
            int firstIndex = rndGen.nextInt(inpArr.length);
            int secondIndex = rndGen.nextInt(inpArr.length);

            String temp = inpArr[firstIndex];
            inpArr[firstIndex] = inpArr[secondIndex];
            inpArr[secondIndex] = temp;
        }

        System.out.println(String.join(System.lineSeparator(), inpArr));
    }
}
