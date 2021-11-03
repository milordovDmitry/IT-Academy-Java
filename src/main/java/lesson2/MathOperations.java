package lesson2;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Сложение");
        System.out.println("Введите первое число:");
        int arg1 = in.nextInt();
        System.out.println("Введите второе число:");
        int arg2 = in.nextInt();
        System.out.println("Сумма чисел равна = " + (arg1 + arg2) + "\n");

        System.out.println("Вычитание");
        System.out.println("Введите первое число:");
        int arg3 = in.nextInt();
        System.out.println("Введите второе число:");
        int arg4 = in.nextInt();
        System.out.println("Разность чисел равна = " + (arg3 - arg4) + "\n");

        System.out.println("Произведение");
        System.out.println("Введите первое число:");
        int arg5 = in.nextInt();
        System.out.println("Введите второе число:");
        int arg6 = in.nextInt();
        System.out.println("Произведение чисел равно = " + (arg5 * arg6) + "\n");

        System.out.println("Деление");
        System.out.println("Введите первое число:");
        double arg7 = in.nextInt();
        System.out.println("Введите второе число:");
        double arg8 = in.nextDouble();
        System.out.println("Частное чисел равно = " + (arg7 / arg8));


    }
}
