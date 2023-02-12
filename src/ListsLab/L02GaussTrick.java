package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L02GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sizeList = numbersList.size();

        for (int i = 0; i < sizeList / 2; i++) {
            int current = numbersList.get(i);
            int last = numbersList.get(numbersList.size() - 1);
            int result = current + last;
            numbersList.set(i, result);
            numbersList.remove(numbersList.size() - 1);
        }
        for (int item : numbersList) {
            System.out.print(item + " ");
        }
    }
}
