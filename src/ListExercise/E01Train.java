package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E01Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacityPerWagon = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();

        while(!input.equals("end")){
            String[] inpArr = input.split(" ");
            String command = inpArr[0];
            if(command.equals("Add")){
                int number = Integer.parseInt(inpArr[1]);
                if(number <= maxCapacityPerWagon) {
                    addWagon(numbersList, number);
                }
            }
            else{
                int passengers = Integer.parseInt(inpArr[0]);
                fitPassengers(numbersList, passengers, maxCapacityPerWagon);
            }
            input = scan.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }

    public static void addWagon(List numbersList, int number){
        numbersList.add(number);
    }

    public static void fitPassengers(List numbersList, int passengers, int maxCapacityPerWagon){
        for(int i = 0; i < numbersList.size(); i++){
            int current = (int) numbersList.get(i);
            int total = current + passengers;
            if(total <= maxCapacityPerWagon){
                numbersList.set(i, total);
                break;
            }
        }
    }
}
