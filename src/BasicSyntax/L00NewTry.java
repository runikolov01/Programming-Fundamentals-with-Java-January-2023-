package BasicSyntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L00NewTry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scan.nextLine();

        while (!input.equals("end")) {
            String[] inpArr = input.split(" ");
            String command = inpArr[0];
            switch (command) {
                case "Delete":
                    String el = inpArr[1];
                    int element = Integer.parseInt(el);
                    for (int i = 0; i < numList.size(); i++) {
                        int currentEl = numList.get(i);
                        if (currentEl == element) {
                            numList.remove(i);
                            i = -1;
                        }
                    }
                    break;
                case "Insert":
                    String ell = inpArr[1];
                    int ellement = Integer.parseInt(ell);
                    String pos = inpArr[2];
                    int position = Integer.parseInt(pos);
                    numList.add(position, ellement);
                    break;
            }
            input = scan.nextLine();
        }

        for(int i = 0; i < numList.size(); i++){
            System.out.printf(numList.get(i) + " ");
        }


    }
}