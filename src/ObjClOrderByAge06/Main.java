package ObjClOrderByAge06;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Person> listPeople = new ArrayList<>();
        while (!input.equals("End")) {
            String[] arr = input.split("\\s+");
            String name = arr[0];
            int id = Integer.parseInt(arr[1]);
            int age = Integer.parseInt(arr[2]);
            Person person = new Person(name, id, age);
            listPeople.add(person);
            input = scan.nextLine();
        }
        listPeople.sort(Comparator.comparing(Person::getAge));

        for (Person person : listPeople) {
            System.out.println(person.getName() + " with ID: " + person.getId() + " is " + person.getAge() + " years old.");
        }
    }
}
