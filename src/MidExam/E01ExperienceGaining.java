package MidExam;

import java.util.Scanner;

public class E01ExperienceGaining {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double neededExperience = Double.parseDouble(scan.nextLine());
        int battleNum = Integer.parseInt(scan.nextLine());
        double sum = 0;
        double remains = neededExperience;
        boolean isAble = false;
        int counter = 0;

        for (int i = 1; i <= battleNum; i++) {
            double earnedPerBattle = Double.parseDouble(scan.nextLine());
            if (i % 3 == 0) {
                earnedPerBattle = earnedPerBattle + (earnedPerBattle * 0.15);
                sum += earnedPerBattle;
            } else if (i % 5 == 0) {
                earnedPerBattle = earnedPerBattle - (earnedPerBattle * 0.1);
                sum += earnedPerBattle;
            } else if (i % 15 == 0) {
                earnedPerBattle = earnedPerBattle + (earnedPerBattle * 0.05);
                sum += earnedPerBattle;
            } else {
                sum += earnedPerBattle;
            }
            remains = neededExperience - sum;
            counter = i;
            if (remains <= 0) {
                counter = i;
                isAble = true;
                i = battleNum + 1;
                break;

            }
        }

        if (isAble) {
            System.out.printf("Player successfully collected his needed experience for %d battles.", counter);
        } else {
            System.out.printf("Player was not able to collect the needed experience, %.02f more needed.", remains);
        }

    }
}
