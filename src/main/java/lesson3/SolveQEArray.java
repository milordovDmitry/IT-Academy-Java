package lesson3;

import java.util.Scanner;

/**
 * Решение квадратного уравнения. Класс SolveQEArray принимает значения коэффициентов квадратного уравнения и возращает
 * результаты в виде массива. main класс в зависимости от количества элементов в массиве выводит в консоль корни
 * уравнения.
 * 2 корня:    3, 7, -6; => 0.6666666666666666 -3.0.
 * 1 корень:    4, 4, 1; => -0.5.
 * нет корней:  2, 2, 1; => Нет действительных решений уравнения.
 */


public class SolveQEArray {
    public static void main(String[] args) {


        System.out.println("Тест");
        double[] roots = solveQEq();

        switch (roots.length) {
            case 2 -> System.out.println(roots[0] + " " + roots[1]);
            case 1 -> System.out.println(roots[0]);
            case 0 -> System.out.println("Нет действительных решений уравнения");
        }
    }

    public static double[] solveQEq() {
        Scanner in = new Scanner(System.in);
        System.out.println("Решаем квадратное уравнение вида ax^2+bx+c=0" + "\n");
        System.out.println("Введите число 'a' (а не должно быть равно 0):");
        while (true) {
            double a = in.nextDouble();
            if (a == 0) {
                System.out.println("'a' не может равно 0" + "'\n" + "\"Введите число 'a':");
            } else {
                System.out.println("Введите число 'b':");
                double b = in.nextDouble();
                System.out.println("Введите число 'с':");
                double c = in.nextDouble();

                double d = (b * b) - (4 * a * c);
                if (d > 0) {
                    double x1 = (-b + Math.sqrt(d)) / (2 * a);
                    double x2 = (-b - Math.sqrt(d)) / (2 * a);
                    double[] resultArray = new double[2];
                    resultArray[0] = x1;
                    resultArray[1] = x2;
                    return resultArray;
                } else if (d == 0) {
                    double x = -b / (2 * a);
                    double[] resultArray = new double[1];
                    resultArray[0] = x;
                    return resultArray;
                } else {
                    return new double[0];
                }
            }
        }
    }
}

