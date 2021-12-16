package lesson11;

public abstract class Vehicle {
    protected String number;
    protected int speed;
    protected double weight, width, height;
    public abstract void move();
    public abstract void kpp();

    public String getNumber() {
        return number;
    }

        public int getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
