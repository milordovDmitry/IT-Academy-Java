package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] fibArray = new int[46];
        for (int i = 0; i < fibArray.length; i++) {
            fibArray[i] = -1;
        }

        while (true) {
            printMenu();
            int n = in.nextInt();
            if (n == 0) {
                break;
            } else if (n < 0) {
                System.out.println("Введено отрицателное число. Введите положительное число:");
            } else if (n > 45) {
                System.out.println("Введено число за пределвми массива. Введите число меньше 46: ");
            } else {
                int element = n - 1;
                if (fibArray[element] != -1) {
                    System.out.println("Этот элемент уже был почитан ранее" + "\n" + n + " - ый член " +
                            "последовательности Фибоначчи: " + fibArray[element]);
                } else {
                    fibArray[element] = finFib(n);
                    System.out.println(n + " - ый член " + "последовательности " +
                            "Фибоначчи: " + fibArray[element] + "\n" + "Поместим его в массив!");
                }
                System.out.println(Arrays.toString(fibArray));
            }
        }
    }

    public static void printMenu() {
        System.out.println("Введите номер члена ряда Фибоначчи, либо '0' - завершить работу программы: ");
    }

    public static int finFib(int element) {
        if (element == 1) {
            return 0;
        } else if (element == 2) {
            return 1;
        } else {
            return finFib(element - 1) + finFib(element - 2);
        }
    }
}
