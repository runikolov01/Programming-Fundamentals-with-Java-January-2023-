package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L05Students {

    static class Student {
        String firstName;
        String lastName;
        String age;
        String homeTown;

        public Student(String firstName, String lastName, String age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getTown() {
            return this.homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String input = scan.nextLine();

        while (!input.equals("end")) {
            String[] studentsDataArr = input.split(" ");
            String firstName = studentsDataArr[0];
            String lastName = studentsDataArr[1];
            String age = studentsDataArr[2];
            String town = studentsDataArr[3];

            Student currentStudent = new Student(firstName, lastName, age, town);
            studentList.add(currentStudent);

            input = scan.nextLine();
        }

        String cityName = scan.nextLine();

        for (Student student : studentList) {
            String currentTown = student.getTown();
            if (cityName.equals(currentTown)) {
                String firstName = student.getFirstName();
                String lastName = student.getLastName();
                String age = student.getAge();

                System.out.printf("%s %s is %s years old", firstName, lastName, age);
                System.out.println();
            }
        }
    }
}
