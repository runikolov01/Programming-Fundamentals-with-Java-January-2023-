package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class E06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int numOpened = 0;
        int numClosed = 0;
        boolean isValid = true;
        int counter = 0;
        int otv = 0;
        int zatv = 0;

        for (int i = 0; i < num; i++) {
            String input = scan.nextLine();
            if(otv==2 || zatv == 2){
                isValid = false;
            }
            if (input.equals("(")) {
                numOpened += 1;
                otv += 1;
                zatv = 0;
            } else if (input.equals(")")) {
                otv = 0;
                zatv += 1;
                numClosed += 1;
            } else {
                counter += 1;
            }
            if (i - counter % 2 == 1 && numOpened != numClosed) {
                isValid = false;
            }
        }
        if (isValid && numOpened == numClosed) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }

    }
}