package lesson3;

import java.util.Scanner;

public class SolveFactorial {
    public static void main(String[] args) {
        System.out.println("Введите число, для которого хотите посчитать факториал:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Факториал числа " + a + " = " + getFactorial(a) + ".");
    }

    public static long getFactorial(long f) {
        long result = 1;
        for (long i = f; i > 1; i--) {
            result = result * i;
        }
        return result;
    }
}
