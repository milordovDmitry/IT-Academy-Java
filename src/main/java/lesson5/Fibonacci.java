package lesson5;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер члена ряда Фибоначчи: ");
        int n = in.nextInt();
        System.out.println(n + " - ый член последовательности Фибоначчи " + finFib(n));
    }

    public static int finFib(int n) {
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return finFib(n - 1) + finFib(n - 2);
        }
    }
}

