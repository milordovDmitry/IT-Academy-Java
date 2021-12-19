package lesson13;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

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
        for (Employee employee : employees) {
            if (employee.getWorkAge() == workAge) {
                System.out.println(employee.getFio() + " идентификационный номер: " + employee.getPersonnelNumber());
            }
        }
    }
}
