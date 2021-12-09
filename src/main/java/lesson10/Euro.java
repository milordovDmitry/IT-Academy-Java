package lesson10;

public class Euro implements Convertible {
    final String type = "Евро";
    public double sum;


    public Euro(double sum) {
        this.sum = sum;
    }

    @Override
    public double convert(double sum, double course) {
        return Convertible.super.convert(sum, course);
    }
}
