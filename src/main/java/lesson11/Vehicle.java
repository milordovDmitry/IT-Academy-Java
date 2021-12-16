package lesson11;

public abstract class Vehicle {

    public abstract void move();

    public abstract void kpp(double weightLimit, double widthLimit, double heightLimit);

    public void checkSpd() {
    }

    public abstract void checkKpp(double weightLimit, double widthLimit, double heightLimit);
}
