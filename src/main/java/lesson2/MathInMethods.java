package lesson2;

import java.util.Scanner;

public class MathInMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            printMenu();
            int command = in.nextInt();

            if (command == 1) {
                System.out.println("Сложение" + "\n" + "Введите первое число:");
                int arg1 = in.nextInt();
                System.out.println("Введите втрое число 2");
                int arg2 = in.nextInt();

                System.out.println("Сумма чисел " + arg1 + " и " + arg2 + " составляет " + summation(arg1, arg2) +
                        "\n");

            } else if (command == 2) {
                System.out.println("Вычитание" + "\n" + "Введите первое число:");
                int arg1 = in.nextInt();
                System.out.println("Введите число 2");
                int arg2 = in.nextInt();

                System.out.println("Разность чисел " + arg1 + " и " + arg2 + " составляет " + subtraction(arg1, arg2) + "\n");

            } else if (command == 3) {
                System.out.println("Умножение" + "\n" + "Введите первое число:");
                int arg1 = in.nextInt();
                System.out.println("Введите число 2");
                int arg2 = in.nextInt();

                System.out.println("Произведение чисел " + arg1 + " и " + arg2 + " составляет " + multiplying(arg1,
                        arg2) + "\n");

            } else if (command == 4) {
                System.out.println("Деление" + "\n" + "Введите первое число:");
                double arg1 = in.nextInt();
                System.out.println("Введите второе число:");
                while (true) {
                    double arg2 = in.nextInt();
                    if (arg2 == 0) {
                        System.out.println("Деление на ноль невозможно." + "\n" + "Введите второе число:");
                    } else {
                        System.out.println("Частное чисел " + arg1 + " и " + arg2 + " составляет " + division(arg1,
                                arg2) + "\n");
                        break;
                    }
                }

            } else if (command == 5) {
                break;
            } else {
                System.out.println("Такой операции нет." + "\n" + "Введите число от 1 до 5.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Введите номер операции, которую вы хотите совершить");
        System.out.println("'1' - сложение" + "\n" + "'2' - вычитание" + "\n" + "'3' - умножение" + "\n" + "'4' - " +
                "деление" + "\n" + "'5' - завершить работу программы");
    }

    public static int summation(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public static int subtraction(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static int multiplying(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static double division(double arg1, double arg2) {
        return arg1 / arg2;
    }
}


