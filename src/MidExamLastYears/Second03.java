package MidExamLastYears;
import java.util.*;
import java.util.stream.Collectors;

//NUMBERS
public class Second03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;


        for(int i = 0; i < numList.size(); i++){
            int current = numList.get(i);
            sum += current;
        }

        int average = sum / numList.size();

        List<Integer> newList = new ArrayList<>();

        for(int k = 0; k < numList.size(); k++){
            int cur = numList.get(k);
            if (cur > average){
                newList.add(cur);
            }
        }

        Collections.sort(newList, Collections.reverseOrder());

        if(newList.size()>0){
            for (int i = 0; i < newList.size(); i++){
                if(i==5){
                    i = newList.size();
                    break;
                }
                else{
                    System.out.printf(newList.get(i) + " ");
                }
            }
        }
        else{
            System.out.println("No");
        }

    }
}