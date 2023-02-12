package MethodsExercise;

import java.util.Scanner;

public class E02VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(countVowels(input));
    }
    public static int countVowels(String input){
        int counter = 0;
        for(int i = 0; i < input.length(); i++){
            char current = input.charAt(i);
            if(current == 'a' || current == 'A' || current == 'u' || current == 'U' || current == 'e' || current == 'E' || current == 'i' || current == 'I' || current == 'o' || current == 'O'){
                counter += 1;
            }
        }
        return counter;
    }

}
