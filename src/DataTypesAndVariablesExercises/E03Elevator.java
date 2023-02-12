package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class E03Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numPeople = Integer.parseInt(scan.nextLine());
        int numCapacity = Integer.parseInt(scan.nextLine());

        int courses = (numPeople / numCapacity);
        if(numPeople%numCapacity > 0){
            courses += 1;
        }
        System.out.println(courses);
    }
}
