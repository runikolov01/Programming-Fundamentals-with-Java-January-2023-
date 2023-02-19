package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03SchoolLibrary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> booksList = Arrays.stream(scan.nextLine().split("\\&")).collect(Collectors.toList());
        String input = scan.nextLine();

        while (!input.equals("Done")) {
            String[] inpArr = input.split(" \\| ");
            String command = inpArr[0];
            switch (command) {
                case "Add Book":
                    String bookName = inpArr[1];
                    if (!booksList.contains(bookName)) {
                        booksList.add(0, bookName);
                    }
                    break;
                case "Take Book":
                    bookName = inpArr[1];
                    if (booksList.contains(bookName)) {
                        booksList.remove(bookName);
                    }
                    break;
                case "Swap Books":
                    String firstBook = inpArr[1];
                    String secondBook = inpArr[2];
                    if (booksList.contains(firstBook) && booksList.contains(secondBook)) {
                        int firstindex = booksList.indexOf(firstBook);
                        int secondIndex = booksList.indexOf(secondBook);
                        firstBook = booksList.set(firstindex, secondBook);
                        secondBook = booksList.set(secondIndex, firstBook);
                    }
                    break;

                case "Insert Book":
                    bookName = inpArr[1];
                    if (!booksList.contains(bookName)) {
                        booksList.add(bookName);
                    }
                    break;

                case "Check Book":
                    String ind = inpArr[1];
                    int index = Integer.parseInt(ind);
                    if (index <= booksList.size() - 1) {
                        System.out.println(booksList.get(index));
                    }
                    break;
            }
            input = scan.nextLine();
        }

        System.out.println(String.join(", ", booksList));
    }
}
