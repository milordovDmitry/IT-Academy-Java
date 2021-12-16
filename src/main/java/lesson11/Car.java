package lesson11;

import static lesson11.MethodsKPP.genCarNumber;
import static lesson11.MethodsKPP.getRndCarSpd;

public class Car extends Vehicle {
    String type = "легковой автомобиль";
    private String number = genCarNumber();
    private int speed = getRndCarSpd();

    @Override
    public void move() throws SpeedException {
        if (speed > 80 & speed < 100) {
            throw new SpeedException(type + " с гос номером " + number + " сбавтье скорость!");
        } else if (speed > 100) {
            throw new SpeedException("Андрюха, у нас превышение более 20 км/ч. Возможно криминал. По коням!" +
                    " " + "Нарушитель: " + type + " с госномером " + number + ".");
        } else {
            System.out.println("Транспортное средство " + type + " с государственным номером " + number + " движется " +
                    "со скоростью " + speed + " км/ч.");
        }
    }

    public void checkSpd() {
        try {
            move();
        } catch (SpeedException e) {
            System.out.println(e);
        }
    }

    public void checkKpp(double weightLimit, double widthLimit, double heightLimit) {
        System.out.println("Транспорное средство " + type + " с гос номером " + number + " проехало КПП.");
    }

    @Override
    public void kpp(double weightLimit, double widthLimit, double heightLimit) {
        System.out.println("Транспорное средство " + type + " с гос номером " + number + " проехало КПП.");
        //  легковой автомобиль всегда может проехать КПП.
    }
}
