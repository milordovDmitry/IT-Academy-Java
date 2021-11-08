package lesson2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;


public class QuadraticEquation {
    /**
     * Решение квадратного равнения и вывод его корней в формате #.## с округлением до второго знака после точки и
     * отбрасыванием нулей в дробной части
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        DecimalFormatSymbols separator = new DecimalFormatSymbols(Locale.getDefault()); // меняем десятичный
        separator.setDecimalSeparator('.');                                             // разделитель на с ',' на '.'

        System.out.println("Решаем квадратное уравнение вида ax^2+bx+c=0" + "\n");

        System.out.println("Введите число 'a' (а != 0):");

        while (true) {                                                          // цикл для проверки а != 0
            double a = in.nextDouble();
            if (a == 0) {
                System.out.println("'a' не может равно 0" + "'\n" + "\"Введите число 'a' (а != 0):");
            } else {
                System.out.println("Введите число 'b':");
                double b = in.nextDouble();
                System.out.println("Введите число 'с':");
                double c = in.nextDouble();

                double d = (b * b) - (4 * a * c);                                 // вычисляем дискриминант d

                if (d > 0) {
                    System.out.println("\n" + "Уравнение имеет 2 корня.");       // пример чисел для проверки: 3, 7, -6
                    double x1 = (-b + Math.sqrt(d)) / (2 * a);
                    double x2 = (-b - Math.sqrt(d)) / (2 * a);

                    System.out.println("Корни уравнения: " + new DecimalFormat("#.##", separator).format(x1) +
                            " и " + new DecimalFormat("#.##", separator).format(x2) + ".");

                } else if (d == 0) {                                            //  пример чисел для проверки: 4, 4, 1
                    System.out.println("\n" + "Уравнение имеет 1 корень.");

                    double x = -b / (2 * a);

                    System.out.println("Корень уравнения: " + new DecimalFormat("#.##", separator).format(x) + ".");

                } else {                                                         //  пример чисел для проверки: 2, 2, 1
                    System.out.println("\n" + "Уравнение не имеет корней.");
                }

                break;
            }
        }
    }
}