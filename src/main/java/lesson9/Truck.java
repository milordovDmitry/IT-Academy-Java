package lesson9;

public class Truck extends Auto {
    final String type = "Грузовик";
    final int maxDistance = 1200;

    public Truck(String model) {
        super(model);
    }

    public void move(int distance) {
        if (distance < maxDistance)
            System.out.println(type + " модели " + model + " проехал " + distance + " километров.");
        else System.out.println((type + " модели " + model + " не может проехать " + distance + " километров" +
                " без заправки."));
    }
}

