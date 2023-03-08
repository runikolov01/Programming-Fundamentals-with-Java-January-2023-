package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L06Students2 {
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

        public void setAge(String age) {
            this.age = age;
        }

        public String getTown() {
            return this.homeTown;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Student> studentLsit = new ArrayList<>();

        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] studentsDataArr = input.split(" ");
            String firstName = studentsDataArr[0];
            String lastName = studentsDataArr[1];
            String age = studentsDataArr[2];
            String town = studentsDataArr[3];

            if (isStudentExisting(studentLsit, firstName, lastName)) {
                int index = getExistingIndex(studentLsit, firstName, lastName);
                studentLsit.get(index).setAge(age);
                studentLsit.get(index).setHomeTown(town);
            } else {
                Student currentStudent = new Student(firstName, lastName, age, town);
                studentLsit.add(currentStudent);
            }

            input = scan.nextLine();
        }
        String cityName = scan.nextLine();

        for (Student student : studentLsit) {
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

    public static int getExistingIndex(List<Student> studentList, String firstName, String lastName) {
        int index = -1;
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                index = i;
            }
        }
        return index;
    }

    static boolean isStudentExisting(List<Student> studentList, String firstName, String lastName) {
        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}
