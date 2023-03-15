package RegularExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E01Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String regex = ">>(?<name>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        List<String> furnituresName = new ArrayList<>();
        double totalPrice = 0;

        while (!input.equals("Purchase")) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double currentPrice = price * quantity;
                totalPrice += currentPrice;
                furnituresName.add(name);
            }

            input = scan.nextLine();
        }

        System.out.println("Bought furniture:");
        furnituresName.forEach(System.out::println);
        System.out.printf("Total money spend: %.02f", totalPrice);
    }
}