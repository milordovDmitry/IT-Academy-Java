package lesson10;

public class Dollars implements Convertible {
    final String type = "Доллары";
    public double sum;


    public Dollars(double sum) {
        this.sum = sum;
    }

    @Override
    public double convert(double sum, double course) {
        return Convertible.super.convert(sum, course);
    }
}
