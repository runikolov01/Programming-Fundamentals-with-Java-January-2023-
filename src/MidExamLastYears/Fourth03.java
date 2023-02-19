package MidExamLastYears;
import java.util.Arrays;
import java.util.Scanner;

//03. Heart Delivery
public class Fourth03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] houses = Arrays.stream(scan.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();

        String command;
        int currentIndex = 0;

        while (!"Love!".equalsIgnoreCase(command = scan.nextLine())) {
            String[] tokens = command.split("\\s+");
            int jumpLength = Integer.parseInt(tokens[1]);
            currentIndex += jumpLength;
            if (currentIndex >= houses.length) {
            }
            if (houses[currentIndex] != 0) {
                houses[currentIndex] -= 2;
                if (houses[currentIndex] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
            }
        }
        System.out.printf("Cupid's last position was %d.%n", currentIndex);
        boolean isSuccessful = true;
        for (int house : houses) {
            if (house != 0) {
                isSuccessful = false;
                break;
            }
        }
        int count = 0;
        for (int house : houses) {
            if (house != 0) {
                count++;
            }
        }
        if (isSuccessful) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", count);
        }
    }
}
