package MidExamLastYears;
import java.util.Scanner;
//01. Bonus Scoring System

public class Fifth01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double numStudents = Double.parseDouble(scan.nextLine());
        double numLectures = Double.parseDouble(scan.nextLine());
        double bonus = Double.parseDouble(scan.nextLine());

        // int numStudents = Integer.parseInt(scan.nextLine());
        //  int numLectures = Integer.parseInt(scan.nextLine());
        //  int bonus = Integer.parseInt(scan.nextLine());
        double maxBonus = Double.MIN_VALUE;
        double totalBonus = 0;
        int maxLect = 0;


        for (int i = 1; i <= numStudents; i++) {
            int att = Integer.parseInt(scan.nextLine());
            double attDouble = (double) att;
            totalBonus = (attDouble / numLectures) * (5 + bonus);
            if (totalBonus > maxBonus) {
                maxBonus = (totalBonus);
                maxLect = att;
            }
        }
        int maxBonusInt = ((int) maxBonus);
        System.out.printf("Max Bonus: %d.", maxBonusInt);
        System.out.println();
        System.out.printf("The student has attended %d lectures.", maxLect);
    }
}
