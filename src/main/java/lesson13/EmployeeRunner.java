package lesson13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import static lesson13.Methods.*;


public class EmployeeRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество сотрудников в фирме");
        int numberEmployees = in.nextInt();
        System.out.println();
        Collection<Employee> employees = new ArrayList<>();
        for (int i = 0; i < numberEmployees; i++) {
            employees.add(getRndEmploye());
        }
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println();
        printEmployee(employees, 5);
    }
}

