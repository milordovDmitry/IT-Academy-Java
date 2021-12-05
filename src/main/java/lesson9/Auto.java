package lesson9;

public abstract class Auto {

    protected String model;
    protected int maxDistance;

    public Auto(String model) {
        this.model = model;

    }

    public abstract void move(int distance);
}
