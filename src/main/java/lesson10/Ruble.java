package lesson10;

public class Ruble implements Convertible {
    final String type = "Рубли";
    public double sum;


    public Ruble(double sum) {
        this.sum = sum;
    }

    @Override
    public double convert(double sum, double course) {
        return sum * course;
    }
}
