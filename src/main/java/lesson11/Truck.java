package lesson11;

import static lesson11.MethodsKPP.*;

public class Truck extends Vehicle {
    String Type = "грузовик";
    String number = genCarNumber();
    int speed = getRndTruckSpd();

    @Override
    public void move() throws SpeedException{
        if (speed > 80 & speed < 100) {
            throw new SpeedException(Type + " с гос номером " + number + " сбавтье скорость!");
        } else if (speed > 100) {
            throw new SpeedException("Андрюха, у нас превышение более 20 км/ч. Возможно криминал. По коням!" +
                    " " + "Нарушитель: " + Type + " с госномером " + number + ".");
        } else {
            System.out.println("Транспортное средство " + Type + " с государственным номером " + number + " движется " +
                    "со скоростью " + speed + ".");
        }
    }

}
