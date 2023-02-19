package MidExamLastYears;
import java.util.Scanner;
//SoftUni Reception
public class Second01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());



        double total = first + second + third;
        int counter = 0;
        while(students>0){
            if(counter%4==0){
                counter+=1;
            }
            counter += 1;
            students -= total;
        }
        int hour = counter-1;
        if(hour<0){
            hour=0;
        }
        System.out.printf("Time needed: %dh.", hour);
    }
}