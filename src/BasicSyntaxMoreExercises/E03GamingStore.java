package BasicSyntaxMoreExercises;

import java.util.Scanner;

public class E03GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double outFall = 39.99;
        double csOg = 15.99;
        double zplinterZell = 19.99;
        double honored = 59.99;
        double roverWatch = 29.99;
        double roverWatchOriginsEdition = 39.99;

        int counterOutFall = 0;
        int countercsOg = 0;
        int counterzplinter = 0;
        int counterHonored = 0;
        int counterRoverWatch = 0;
        int counterRovWatchOrig = 0;

        double ballance = Double.parseDouble(scan.nextLine());

        String name = scan.nextLine();

        while(!name.equals("Game Time")){
            if(name.equals("OutFall 4")){
                if (ballance >= outFall) {
                    ballance -= outFall;
                    System.out.println("Bought OutFall 4");
                    counterOutFall += 1;

                }
                else{
                    System.out.println("Too Expensive");
                }
            }
            else if(name.equals("CS: OG")){
                if (ballance >= csOg) {
                    ballance -= csOg;
                    System.out.println("Bought CS: OG");
                    countercsOg += 1;
                }
                else{
                    System.out.println("Too Expensive");
                }
            }
            else if(name.equals("Zplinter Zell")){
                if(ballance >= zplinterZell) {
                    ballance -= zplinterZell;
                    System.out.println("Bought Zplinter Zell");
                    counterzplinter += 1;

                }
                 else{
                    System.out.println("Too Expensive");
                }
            }
            else if(name.equals("Honored 2")){
                if(ballance >= honored) {
                    ballance -= honored;
                    System.out.println("Bought Honored 2");
                    counterHonored += 1;

                }
                else{
                    System.out.println("Too Expensive");
                }
            }
            else if(name.equals("RoverWatch")){
                if(ballance >= roverWatch){
                    ballance -= roverWatch;
                    System.out.println("Bought RoverWatch");
                    counterRoverWatch += 1;
                }
                else {
                    System.out.println("Too Expensive");
                }
            }
            else if(name.equals("RoverWatch Origins Edition")){
                if(ballance >= roverWatchOriginsEdition){
                    ballance -= roverWatchOriginsEdition;
                    System.out.println("Bought RoverWatch Origins Edition");
                    counterRovWatchOrig += 1;

                }
                else {
                    System.out.println("Too Expensive");
                }
            }
            else{
                System.out.println("Not Found");
            }
            if(ballance == 0){
                System.out.println("Out of money!");
                break;
            }
            name = scan.nextLine();
        }
        double totalSpent = (counterOutFall * outFall) + (countercsOg * csOg) + (counterzplinter * zplinterZell) + (counterHonored * honored) + (counterRoverWatch * roverWatch) + (counterRovWatchOrig * roverWatchOriginsEdition);
        if(ballance > 0) {
            System.out.printf("Total spent: $%.02f. ", totalSpent);
            System.out.printf("Remaining: $%.02f%n", ballance);
        }
    }
}
