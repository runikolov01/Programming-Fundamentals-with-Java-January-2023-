package ObjClStudents04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        List<Students> studentsList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String input = scan.nextLine();
            String[] inpArr = input.split("\\s+");
            String firstName = inpArr[0];
            String lastName = inpArr[1];
            double grade = Double.parseDouble(inpArr[2]);

            Students studentObject = new Students(firstName, lastName, grade);
            studentsList.add(studentObject);
        }

        studentsList.sort(Comparator.comparing(Students::getGrade).reversed());

        for (Students student : studentsList) {
            System.out.printf("%s %s: %.02f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
