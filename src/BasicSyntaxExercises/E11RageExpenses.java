package BasicSyntaxExercises;

import java.util.Scanner;

public class E11RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        int headsetNum = 0;
        int mouseNum = 0;
        int keyboardNum = 0;
        int displayNum = 0;

        int headsetThisGame = 0;
        int mouseThisGame = 0;

        for(int i = 1; i<= lostGamesCount; i++){
            headsetThisGame = 0;
            mouseThisGame = 0;
            if(i%2 == 0){
                headsetNum += 1;
                headsetThisGame += 1;
            }
            if(i%3 == 0){
                mouseNum += 1;
                mouseThisGame += 1;
            }
            if(headsetThisGame == 1 && mouseThisGame == 1){
                keyboardNum += 1;
                if(keyboardNum %2 == 0){
                    displayNum += 1;
                }
            }

        }
        double totalPrice = (headsetPrice * headsetNum) + (mousePrice * mouseNum) + (keyboardPrice * keyboardNum) + (displayPrice * displayNum);

        System.out.printf("Rage expenses: %.02f lv.", totalPrice);
    }
}
