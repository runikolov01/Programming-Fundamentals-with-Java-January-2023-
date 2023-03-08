package ObjClArticle02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] inpArr = input.split(", ");
        String title = inpArr[0];
        String content = inpArr[1];
        String author = inpArr[2];
        Article article = new Article(title, content, author);
        int number = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < number; i++) {
            String inp = scan.nextLine();
            String[] arr = inp.split(": ");
            String command = arr[0];
            String newCon = arr[1];
            switch (command) {
                case "Edit":
                    article.edit(newCon);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(newCon);
                    break;
                case "Rename":
                    article.renameTitle(newCon);
                    break;
            }
        }

        System.out.println(article.toString());
    }
}
