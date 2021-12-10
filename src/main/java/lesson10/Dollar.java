package lesson10;

public class Dollar implements Convertible {
    final String type = "Доллары";
    public double sum;


    public Dollar(double sum) {
        this.sum = sum;
    }

    @Override
    public double convert(double sum, double course) {
        return Convertible.super.convert(sum, course);
    }
}
