package ObjectsAndClassesExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class E01AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> phrasesList = new ArrayList<>();
        phrasesList.add("Excellent product.");
        phrasesList.add("Such a great product.");
        phrasesList.add("I always use that product.");
        phrasesList.add("Best product of its category.");
        phrasesList.add("Exceptional product.");
        phrasesList.add("I can’t live without this product.");
        phrasesList.add("Excellent product.");
        phrasesList.add("Such a great product.");
        phrasesList.add("I always use that product.");
        phrasesList.add("Best product of its category.");
        phrasesList.add("Exceptional product.");
        phrasesList.add("I can’t live without this product.");

        List<String> eventsList = new ArrayList<>();
        eventsList.add("Now I feel good.");
        eventsList.add("I have succeeded with this product.");
        eventsList.add("Makes miracles. I am happy of the results!");
        eventsList.add("I cannot believe but now I feel awesome.");
        eventsList.add("Try it yourself, I am very satisfied.");
        eventsList.add("I feel great!");

        List<String> authorsList = new ArrayList<>();
        authorsList.add("Diana");
        authorsList.add("Petya");
        authorsList.add("Stella");
        authorsList.add("Elena");
        authorsList.add("Katya");
        authorsList.add("Iva");
        authorsList.add("Annie");
        authorsList.add("Eva");

        List<String> citiesList = new ArrayList<>();
        citiesList.add("Burgas");
        citiesList.add("Sofia");
        citiesList.add("Plovdiv");
        citiesList.add("Varna");
        citiesList.add("Ruse");

        Random rnd = new Random();
        int number = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < number; i++) {
            int phraseIndex = rnd.nextInt(0, phrasesList.size());
            int eventIndex = rnd.nextInt(0, eventsList.size());
            int authorIndex = rnd.nextInt(0, authorsList.size());
            int cityIndex = rnd.nextInt(0, citiesList.size());

            System.out.printf("%s %s %s - %s%n", phrasesList.get(phraseIndex), eventsList.get(eventIndex), authorsList.get(authorIndex), citiesList.get(cityIndex));
        }
    }
}
