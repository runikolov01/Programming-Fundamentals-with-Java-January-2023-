package BasicSyntaxExercises;

import java.util.Scanner;

public class E01Ages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        String person = "";

        if(age>=0 && age <=2){
            person = "baby";
        }
        else if(age>=3 && age <= 13){
            person = "child";
        }
        else if(age >=14 && age <= 19){
            person = "teenager";
        }
        else if(age >=20 && age <= 65){
            person = "adult";
        }
        else if(age>=66){
            person = "elder";
        }
        System.out.println(person);
    }
}
