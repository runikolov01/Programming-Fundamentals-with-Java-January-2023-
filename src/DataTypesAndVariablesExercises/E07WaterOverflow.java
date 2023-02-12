package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class E07WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int capacity = 0;
        int total = 0;
        int free = 255;

        for(int i = 1; i <=n; i++){
            capacity = Integer.parseInt(scan.nextLine());
            if(free<0 || capacity>free){
                System.out.println("Insufficient capacity!");
            }
            else{
                free -= capacity;
                total += capacity;
            }
        }
        System.out.println(total);
    }
}
