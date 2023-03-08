package ObjClOpinionPoll03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Person> peopleList = new ArrayList<>();
        int number = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < number; i++) {
            String data = scan.nextLine();
            String[] array = data.split("\\s+");
            String name = array[0];
            int age = Integer.parseInt(array[1]);
            if (age > 30) {
                Person person = new Person(name, age);
                peopleList.add(person);
            }
        }

        for (Person person : peopleList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
