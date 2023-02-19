package MidExamLastYears;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//02. Shopping List
public class Fourth02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> productsList = Arrays.stream(scan.nextLine().split("\\!")).collect(Collectors.toList());

        String input = scan.nextLine();

        while(!input.equals("Go Shopping!")){
            String[] inpArr = input.split(" ");
            String command = inpArr[0];
            if(command.equals("Urgent")){
                String item = inpArr[1];
                if(!productsList.contains(item)){
                    productsList.add(0, item);
                }
            }
            else if(command.equals("Unnecessary")){
                String item = inpArr[1];
                if(productsList.contains(item)){
                    productsList.remove(item);
                }
            }
            else if(command.equals("Correct")){
                String oldItem = inpArr[1];
                String newItem = inpArr[2];
                if(productsList.contains(oldItem)){
                    int index = productsList.indexOf(oldItem);
                    productsList.set(index, newItem);
                }
            }
            else if(command.equals("Rearrange")){
                String item = inpArr[1];
                if(productsList.contains(item)){
                    int index = productsList.indexOf(item);
                    productsList.remove(index);
                    productsList.add(item);
                }
            }

            input = scan.nextLine();
        }

        System.out.println(String.join(", ", productsList));
    }
}
