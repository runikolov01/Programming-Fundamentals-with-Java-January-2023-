package DataTypesAndVariables;

import java.util.Scanner;

public class L08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char letter = scan.nextLine().charAt(0);

       if(Character.isUpperCase(letter)){
           System.out.println("upper-case");
       }
       else{
           System.out.println("lower-case");
       }
    }
}
