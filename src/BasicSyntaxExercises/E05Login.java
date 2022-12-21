package BasicSyntaxExercises;

import java.util.Scanner;

public class E05Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        String guess = scan.nextLine();
        char currentSymbol = 'a';
        int length = username.length() - 1;
        String password = "";
        int counter = 1;

        for(int postition = length; postition>=0; postition--){
            currentSymbol = username.charAt(postition);
            password += currentSymbol;
        }
        while(!password.equals(guess)){
            if (counter == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            guess = scan.nextLine();
            counter +=1;
        }
        if(password.equals(guess))
        System.out.printf("User %s logged in.", username);
        scan.close();
    }
}
