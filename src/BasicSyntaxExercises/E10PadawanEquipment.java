package BasicSyntaxExercises;

import java.util.Scanner;

public class E10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //•	If the calculated price of the equipment is less or equal to the money George Lucas has:
        //"The money is enough - it would cost {the cost of the equipment}lv."
        //•	If the calculated price of the equipment is more than the money George Lucas has:
        // "George Lucas will need {neededMoney}lv more."
        //•	All prices must be rounded to two digits after the decimal point.

        double moneyGeorgeHas = Double.parseDouble(scan.nextLine());
        int numStudents = Integer.parseInt(scan.nextLine());
        double priceLightsabersPerOne = Double.parseDouble(scan.nextLine());
        double priceRobesPerOne = Double.parseDouble(scan.nextLine());
        double priceBeltsPerOne = Double.parseDouble(scan.nextLine());

        double studentsDouble = Double.valueOf(numStudents);
        double lightsabers = studentsDouble + (studentsDouble * 0.1);
        double totalLighsabersNum = Math.ceil(lightsabers);
        double totalLighsabersPrice = totalLighsabersNum * priceLightsabersPerOne;

        double freeBelts = numStudents / 6;
        double beltsTotalPrice = ( numStudents - freeBelts ) * priceBeltsPerOne;

        double robesTotalPrice = priceRobesPerOne * studentsDouble;

        double totalPrice = totalLighsabersPrice + beltsTotalPrice + robesTotalPrice;

        if(totalPrice <= moneyGeorgeHas){
            System.out.printf("The money is enough - it would cost %.02flv.", totalPrice);
        }
        else{
            double needed = totalPrice - moneyGeorgeHas;
            System.out.printf("George Lucas will need %.02flv more.", needed);
        }
    }
}
