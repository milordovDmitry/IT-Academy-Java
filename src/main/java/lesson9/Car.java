package lesson9;

public class Car extends Auto {
    final String type = "Автомобиль";
    final int maxDistance = 500;

    public Car(String model) {
        super(model);
    }

    public void move(int distance) {
        if (distance < maxDistance)
            System.out.println(type + " модели " + model + " проехал " + distance + " километров.");
        else System.out.println((type + " модели " + model + " не может проехать " + distance + " километров" +
                " без заправки."));
    }
}

