package BasicSyntaxExercises;

import java.util.Scanner;

public class E03Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalNum = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String day = scan.nextLine();
        double perDay = 0;

        if(day.equals("Friday")){
            if(type.equals("Students")){
                perDay = 8.45;
            }
            else if(type.equals("Business")){
                perDay = 10.9;
            }
            else if(type.equals("Regular")){
                perDay = 15;
            }
        }
        else if(day.equals("Saturday")){
            if(type.equals("Students")){
                perDay = 9.8;
            }
            else if(type.equals("Business")){
                perDay = 15.6;
            }
            else if(type.equals("Regular")){
                perDay = 20;
            }
        }
        else if(day.equals("Sunday")){
            if(type.equals("Students")){
                perDay = 10.46;
            }
            else if(type.equals("Business")){
                perDay = 16;
            }
            else if(type.equals("Regular")){
                perDay = 22.50;
            }
        }
        double total = totalNum * perDay;
        if(type.equals("Students") && totalNum>=30){
            total = total - (total * 0.15);
        }
        else if(type.equals("Business") && totalNum>=100){
            double onePerson = total/totalNum;
            total = total - (onePerson * 10);
        }
        else if(type.equals("Regular") && totalNum >= 10 && totalNum <= 20){
            total = total - (total * 0.05);
        }
        System.out.printf("Total price: %.02f", total);
    }
}
