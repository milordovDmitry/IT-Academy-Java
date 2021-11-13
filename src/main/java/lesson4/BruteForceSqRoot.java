package lesson4;

import java.util.Scanner;

public class BruteForceSqRoot {

    public static void main(String[] args) {
        System.out.println("Введите число, для которого вы хотите найти корень: ");
        Scanner in = new Scanner(System.in);

        while (true) {
            int a = in.nextInt();

            if (a == 0) {
                System.out.println("Корень числа 0 = 0.");
                break;
            } else if (a < 0) {
                System.out.println("Невозможно найти корень отрицального числа" + "\n" + "Введите число: ");
            } else {
                int root = findRoot(a);
                System.out.println("квадратный корень числа " + a + " = " + root);
                break;
            }
        }
    }
        public static int findRoot(int a) {
            int i;
            for (i = 0; a != (i * i); i++);
            return i;
        }
    }


