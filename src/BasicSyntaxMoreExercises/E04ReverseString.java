package BasicSyntaxMoreExercises;

import java.util.Scanner;

public class E04ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        char current = 'a';
        int length = word.length() - 1;
        String newWord = "";

        for (int i = length; i >= 0; i--) {
            current = word.charAt(i);
            newWord += current;
        }
        System.out.println(newWord);
    }
}
