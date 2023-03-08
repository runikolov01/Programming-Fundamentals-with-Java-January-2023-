package ObjClMoreEx01CompanyRoster;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        List<Employee> employeeList = new ArrayList<>();
        double highestSalary = 0;
        String highestDepartment = " ";

        for (int i = 0; i < number; i++) {
            String input = scan.nextLine();
            String[] arr = input.split("\\s+");
            String name = arr[0];
            double salary = Double.parseDouble(arr[1]);
            String position = arr[2];
            String department = arr[3];

            if (highestSalary < salary){
                highestSalary = salary;
                highestDepartment = department;
            }

            if (arr.length == 4) {
                Employee employeeObj = new Employee(name, salary, position, department);
                employeeList.add(employeeObj);
            } else if (arr.length == 5) {
                String finding = arr[4];
                if (finding.length() > 2) {
                    // tipa e email
                    String email = arr[4];
                    Employee employeeObj = new Employee(name, salary, position, department, email);
                    employeeList.add(employeeObj);
                } else {
                    //tipa e age
                    int age = Integer.parseInt(arr[4]);
                    Employee employeeObj = new Employee(name, salary, position, department, age);
                    employeeList.add(employeeObj);
                }

            } else if (arr.length == 6) {
                String email = arr[4];
                int age = Integer.parseInt(arr[5]);
                Employee employeeObj = new Employee(name, salary, position, department, email, age);
                employeeList.add(employeeObj);
            }
        }
        double totalSalary = 0;

        Collections.sort(employeeList, Comparator.comparingDouble(Employee::getSalary));
        Collections.reverse(employeeList);
        System.out.println("Highest Average Salary: " + highestDepartment);
        for (Employee item : employeeList){
            if (highestDepartment.equals(item.getDepartment())){
                System.out.printf("%s %.2f %s %d%n", item.getName(), item.getSalary(), item.getEmail(), item.getAge());
            }
        }
    }
}
