package ListsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L06ListOfProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> productsList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String product = scan.nextLine();
            productsList.add(product);
        }
        Collections.sort(productsList);
        for(int k = 0; k < productsList.size(); k++){
            System.out.printf("%d.%s", k+1, productsList.get(k));
            System.out.println();
        }
    }
}
