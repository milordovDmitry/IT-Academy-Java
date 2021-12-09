package lesson10;

public interface Convertible {


    default double  convert(double value, double ratio) {
     return value * ratio;
    }
}
