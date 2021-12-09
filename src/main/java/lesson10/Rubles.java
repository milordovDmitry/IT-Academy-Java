package lesson10;

public class Rubles implements Convertible {
    final String type = "Рубли";
    public double sum;


    public Rubles(double sum) {
        this.sum = sum;
    }

    @Override
    public double convert(double sum, double course) {
        return Convertible.super.convert(sum, course);
    }
}
