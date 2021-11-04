package lesson2;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Сложение" + "\n" + "Введите первое число:");
        int arg1 = in.nextInt();
        System.out.println("Введите второе число:");
        int arg2 = in.nextInt();
        System.out.println("Сумма чисел равна = " + (arg1 + arg2) + "\n");

        System.out.println("Вычитание" + "\n" + "Введите первое число:");
        int arg3 = in.nextInt();
        System.out.println("Введите второе число:");
        int arg4 = in.nextInt();
        System.out.println("Разность чисел равна = " + (arg3 - arg4) + "\n");

        System.out.println("Произведение" + "\n" + "Введите первое число:");

        int arg5 = in.nextInt();
        System.out.println("Введите второе число:");
        int arg6 = in.nextInt();
        System.out.println("Произведение чисел равно = " + (arg5 * arg6) + "\n");

        System.out.println("Деление чисел" + "\n" + "Введите первое число:");

        double arg7 = in.nextDouble();
        System.out.println("Введите второе число:");
        while (true) {
            double arg8 = in.nextDouble();
            if (arg8 == 0) {
                System.out.println("Деление на ноль невозможно" + "\n" + "Введите второе число:");
            } else {
                System.out.println("Частное чисел равно = " + (arg7 / arg8));
                break;
            }
        }
    }
}
