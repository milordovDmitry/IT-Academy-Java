package lesson2;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сложение" + "\n");
        System.out.println("Введите первое число:");
        int arg1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int arg2 = scanner.nextInt();
        System.out.println("Сумма чисел равна = " + (arg1 + arg2) + "\n");

        System.out.println("Вычитание" + "\n");
        System.out.println("Введите первое число:");
        int arg3 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int arg4 = scanner.nextInt();
        System.out.println("Разность чисел равна = " + (arg3 - arg4) + "\n");

        System.out.println("Произведение" + "\n");
        System.out.println("Введите первое число:");
        int arg5 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int arg6 = scanner.nextInt();
        System.out.println("Произведение чисел равно = " + (arg5 * arg6) + "\n");

        System.out.println("Деление" + "\n");
        System.out.println("Введите первое число:");
        double arg7 = scanner.nextInt();
        System.out.println("Введите второе число:");
        double arg8 = scanner.nextDouble();
        System.out.println("Частное чисел равно = " + (arg7 / arg8));


    }
}
