package MidExamLastYears;
import java.util.Scanner;
//01. Guinea Pig
public class Fourth01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double foodKg = Double.parseDouble(scan.nextLine());
        double hayKg = Double.parseDouble(scan.nextLine());
        double coverKg = Double.parseDouble(scan.nextLine());
        double weightKg = Double.parseDouble(scan.nextLine());

        double foodGrams = foodKg * 1000;
        double hayGrams = hayKg * 1000;
        double coverGrams = coverKg * 1000;
        double weightGrams = weightKg * 1000;
        boolean isValid = true;

        for (int i = 1; i <= 30; i++) {
            if (foodGrams > 300) {
                foodGrams -= 300;
            } else {
                isValid = false;
                break;
            }
            if (i % 2 == 0) {
                double neededHay = (foodGrams * 0.05);
                if (hayGrams > neededHay) {
                    hayGrams -= neededHay;
                } else {
                    isValid = false;
                    break;
                }
            }
            if (i % 3 == 0) {
                double neededCover = weightGrams / 3;
                if (coverGrams > neededCover) {
                    coverGrams -= neededCover;
                } else {
                    isValid = false;
                    break;
                }
            }

        }
        if (isValid) {
            foodKg = foodGrams / 1000;
            hayKg = hayGrams / 1000;
            coverKg = coverGrams / 1000;
            System.out.printf("Everything is fine! Puppy is happy! Food: %.02f, Hay: %.02f, Cover: %.02f.", foodKg, hayKg, coverKg);
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}
