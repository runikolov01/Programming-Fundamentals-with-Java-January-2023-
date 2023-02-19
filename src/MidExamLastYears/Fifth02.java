package MidExamLastYears;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//02. MuOnline => NE RABOTI
public class Fifth02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int health = 100;
        int bitcoins = 0;
        List<String> roomsArr = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());
        int numRooms = roomsArr.size();
        for(int i = 0; i < numRooms; i++){
            String currentRoom = roomsArr.get(i);
            //String[] curArr = roomsArr[i].Split().toArray();
            //String command = curArr[0];
            //System.out.println(command);

        }
    }
}
