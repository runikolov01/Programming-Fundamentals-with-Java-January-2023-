package BasicSyntax;

import java.util.Scanner;

public class L04Back {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int min = Integer.parseInt(scan.nextLine());

        int minutes = min + 30;
        if(minutes>60){
            hour += 1;
            minutes -= 60;
        }
        if(hour>=24){
            hour = 0;
        }
        String result = String.format("%d:%02d", hour, minutes);
        System.out.println(result);

    }
}
