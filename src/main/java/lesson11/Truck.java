package lesson11;

import static lesson11.MethodsKPP.*;

public class Truck extends Vehicle {
    private String type = "грузовик";
    private String number = genCarNumber();
    private int speed = getRndTruckSpd();
    private double weight = getRndTruckWeight();
    private double width = getRndTruckWidth();
    private double height = getRndHeight();
    private double weightLimit;
    private double widthLimit;
    private double heightLimit;


    @Override
    public void move() throws SpeedException {
        if (speed > 80 & speed < 100) {
            throw new SpeedException(type + " с гос номером " + number + " сбавте скорость!");
        } else if (speed > 100) {
            throw new SpeedException("Андрюха, у нас превышение более 20 км/ч. Возможно криминал. По коням!" +
                    " " + "Нарушитель: " + type + " с госномером " + number + ".");
        } else {
            System.out.println("Транспортное средство " + type + " с государственным номером " + number + " движется " +
                    "со скоростью " + speed + ".");
        }
    }

    @Override
    public void kpp ( double weightLimit, double widthLimit,double heightLimit) throws KppParamException {

        if (weight > weightLimit || height > heightLimit || width > widthLimit) {
            throw new KppParamException("Транспорное средство " + type + " с гос номером " + number + " не может " +
                    "проехать КПП");
        } else {
            System.out.println("Транспорное средство " + type + " с гос номером " + number + " проехало КПП");
        }
    }
}
