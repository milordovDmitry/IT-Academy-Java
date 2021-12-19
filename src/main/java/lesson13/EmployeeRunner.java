package lesson13;

import java.util.ArrayList;
import java.util.Collection;

import static lesson13.Methods.*;


public class EmployeeRunner {
    public static void main(String[] args) {
        Collection<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            employees.add(getRndEmploye());
        }
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        printEmployee(employees, 5);
    }
}

