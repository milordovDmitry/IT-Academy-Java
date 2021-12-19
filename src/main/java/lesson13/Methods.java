package lesson13;

import java.util.*;

public class Methods {


    public static Employee getRndEmploye() {
        int rndPersonnelNumber = new Random().nextInt(99999 - 10000) + 10000;
        int rndWorkAge = new Random().nextInt(10 - 1) + 1;
        String rndFio = rndFio();
        return new Employee(rndPersonnelNumber, rndWorkAge, rndFio);
    }

    public static String rndFio() {
        return rndName() + " " + rndSurname();
    }

    public static Name rndName() {
        Name[] values = Name.values();
        int length = values.length;
        int rndIndex = new Random().nextInt(length);
        return values[rndIndex];

    }

    public static Surname rndSurname() {
        Surname[] values = Surname.values();
        int length = values.length;
        int rndIndex = new Random().nextInt(length);
        return values[rndIndex];
    }


    public static void printEmployee(Collection<Employee> employees, int workAge) {
        System.out.println("Рабочий стаж в " + workAge + " лет имеют следующие сотрудники:");


        for (Iterator<Employee> iterator = employees.iterator(); iterator.hasNext(); ) {
            Employee employee = iterator.next();
            if (employee.getWorkAge() == workAge) {
                System.out.println(employee.getFio() + " идентификационный номер: " + employee.getPersonnelNumber());
            }
        }
    }

    public static void deleteEven(Collection<Employee> employees) {
        ArrayList<Employee> firedEmployee = (ArrayList<Employee>) employees;
        for (ListIterator<Employee> iterator = firedEmployee.listIterator(firedEmployee.size()); iterator.hasPrevious(); ) {
            Employee fired = iterator.previous();
            if (iterator.nextIndex() % 2 != 0) {
                iterator.remove();
            }

        }
        System.out.println("Список сотрудников после сокращения: ");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
