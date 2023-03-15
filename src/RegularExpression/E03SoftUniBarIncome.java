package RegularExpression;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double totalPrice = 0;
        String regex = "%(?<customerName>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";

        while (!input.equals("end of shift")) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("customerName");
                String product = matcher.group("product");
                double price = Double.parseDouble(matcher.group("price"));
                int count = Integer.parseInt(matcher.group("count"));

                double currentPrice = price * count;
                totalPrice += currentPrice;

                System.out.printf("%s: %s - %.02f%n", name, product, currentPrice);
            }
            input = scan.nextLine();
        }
        System.out.printf("Total income: %.02f", totalPrice);
    }
}