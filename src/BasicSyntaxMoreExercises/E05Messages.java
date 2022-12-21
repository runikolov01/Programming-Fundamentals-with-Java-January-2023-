package BasicSyntaxMoreExercises;

import java.util.Scanner;

public class E05Messages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTotal = Integer.parseInt(scan.nextLine());
        int digit = 0;
        String message = "";
        char letter = ' ';
        char current = 'a';

        for(int i = 0; i < numTotal; i++){
            int num = Integer.parseInt(scan.nextLine());

            String numString = (String.valueOf(num));
            int length = numString.length();
            current = numString.charAt(0);
            digit = Character.getNumericValue(current);

            if(digit == 2){
                if(length == 1){
                    letter = 'a';
                    message += letter;
                }
                else if(length == 2){
                    letter = 'b';
                    message += letter;

                }
                else if(length == 3){
                    letter = 'c';
                    message += letter;

                }
            }

            else if(digit == 3){
                if(length == 1){
                    letter = 'd';
                    message += letter;
                }
                else if(length == 2){
                    letter = 'e';
                    message += letter;

                }
                else if(length == 3){
                    letter = 'f';
                    message += letter;

                }
            }
            else if(digit == 4){
                if(length == 1){
                    letter = 'g';
                    message += letter;
                }
                else if(length == 2){
                    letter = 'h';
                    message += letter;

                }
                else if(length == 3){
                    letter = 'i';
                    message += letter;
                }
            }
            else if(digit == 5){
                if(length == 1){
                    letter = 'j';
                    message += letter;
                }
                else if(length == 2){
                    letter = 'k';
                    message += letter;

                }
                else if(length == 3){
                    letter = 'l';
                    message += letter;

                }
            }
            else if(digit == 6){
                if(length == 1){
                    letter = 'm';
                    message += letter;
                }
                else if(length == 2){
                    letter = 'n';
                    message += letter;

                }
                else if(length == 3){
                    letter = 'o';
                    message += letter;

                }
            }
            else if(digit == 7){
                if(length == 1){
                    letter = 'p';
                    message += letter;
                }
                else if(length == 2){
                    letter = 'q';
                    message += letter;

                }
                else if(length == 3){
                    letter = 'r';
                    message += letter;
                }
                else if(length == 4){
                    letter = 's';
                    message += letter;
                }
            }
            else if(digit == 8){
                if(length == 1){
                    letter = 't';
                    message += letter;
                }
                else if(length == 2){
                    letter = 'u';
                    message += letter;

                }
                else if(length == 3){
                    letter = 'v';
                    message += letter;
                }
            }
            else if(digit == 9){
                if(length == 1){
                    letter = 'w';
                    message += letter;
                }
                else if(length == 2){
                    letter = 'x';
                    message += letter;

                }
                else if(length == 3){
                    letter = 'y';
                    message += letter;
                }
                else if(length == 4){
                    letter = 'z';
                    message += letter;
                }
            }
            else if(digit == 0){
                letter = ' ';
                message += letter;
            }
            }
        System.out.println(message);
        }
}
