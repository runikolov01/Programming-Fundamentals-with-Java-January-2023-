package TextProcessing;

import java.util.Scanner;

public class E03ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arrInput = scan.nextLine().split("\\\\");
        int arrLength = arrInput.length - 1;
        String[] templatearr = arrInput[arrLength].split("\\.");
        String name = templatearr[0];
        String ext = templatearr[1];
        System.out.println("File name: " + name);
        System.out.println("File extension: " + ext);
    }
}
