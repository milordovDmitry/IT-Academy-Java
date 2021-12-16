package lesson11;

import static lesson11.MethodsKPP.*;

public class Truck extends Vehicle {
    private String type = "грузовик";
    private String number = genCarNumber();
    private int speed = getRndTruckSpd();
    private double weight = getRndTruckWeight();
    private double width = getRndTruckWidth();
    private double height = getRndHeight();


    @Override
    public void move() throws SpeedException {
        if (speed > 80 & speed < 100) {
            throw new SpeedException(type + " с государственным номером " + number + " сбавьте скорость!");
        } else if (speed > 100) {
            throw new SpeedException("Андрюха, у нас превышение более 20 км/ч. Возможно криминал. По коням!" +
                    " " + "Нарушитель: " + type + " с государственным номером " + number + ".");
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


    @Override
    public void checkKpp(double weightLimit, double widthLimit, double heightLimit) {

        try {
            kpp(weightLimit, widthLimit, heightLimit);
        } catch (KppParamException e) {
            System.out.println(e);
        }
    }

    @Override
    public void kpp(double weightLimit, double widthLimit, double heightLimit) throws KppParamException {

        if (weight > weightLimit || height > heightLimit || width > widthLimit) {
            throw new KppParamException("Транспорное средство " + type + " с государственным номером " + number + " " +
                    "не может " +
                    "проехать КПП.");
        } else {
            System.out.println("Транспорное средство " + type + " с государственным номером " + number + " проехало " +
                    "КПП.");
        }
    }
}

