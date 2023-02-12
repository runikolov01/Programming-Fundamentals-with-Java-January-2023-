package ArraysLab;

import java.util.Scanner;

public class L01DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] dayOfWeekArr = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        int n = Integer.parseInt(scan.nextLine());
        if(n >= 1 && n <=7){
            System.out.println(dayOfWeekArr[n-1]);
        }
        else{
            System.out.println("Invalid day!");
        }
    }
}
