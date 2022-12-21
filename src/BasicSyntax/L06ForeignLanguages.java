package BasicSyntax;

import java.util.Scanner;

public class L06ForeignLanguages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String country = scan.nextLine();
        String language = "";

        switch (country){
            case "USA":
            case "England":
                language = "English";
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                language = "Spanish";
                break;
            default:
                language = "unknown";
        }
        System.out.println(language);
    }
}
