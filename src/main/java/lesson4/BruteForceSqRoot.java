package lesson4;

import java.util.Scanner;

public class BruteForceSqRoot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Найти корень числа: ");
        int a = in.nextInt();
        squareRoot(a);
    }

    public static void squareRoot(int a) {
        if (a < 0) {
            System.out.println("Нет корня");
        } else {
            for (int i = 0; i * i <= a; i++) {
               int  twoSquared = i * i;
                if (twoSquared == a) {
                    System.out.println("корень квадратный из числа: " + i + " и " + -i);
                    break;
                } else if ((i + 1) * (i + 1) > a) {
                    System.out.println("Нет целочисленного решения решения");
                }
            }
        }
    }
}