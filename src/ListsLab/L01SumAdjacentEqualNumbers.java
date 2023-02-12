package ListsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scan.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbersList.size()-1; i++) {
            double currentNum = numbersList.get(i);
            double nextNum = numbersList.get(i+1);
            if(currentNum == nextNum){
                double sum = currentNum + nextNum;
                numbersList.set(i, sum);
                numbersList.remove(i+1);
                i = -1;
            }
        }
        for(int k = 0; k < numbersList.size(); k++){
            DecimalFormat df = new DecimalFormat("0.##");
            System.out.printf(df.format(numbersList.get(k)) + " ");
        }
    }
}
