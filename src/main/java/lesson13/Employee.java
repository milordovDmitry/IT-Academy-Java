package lesson13;

public class Employee {
    private int personnelNumber, workAge;

    private String fio;

    public Employee(int personnelNumber, int workAge, String fio) {
        this.personnelNumber = personnelNumber;
        this.workAge = workAge;
        this.fio = fio;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public int getWorkAge() {
        return workAge;
    }

    public String getFio() {
        return fio;
    }

    @Override
    public String toString() {
        return  ("Работник по имени " + fio + " с персональным номером " + personnelNumber +  " имеет опыт работы " + workAge + " лет.");
    }
}
