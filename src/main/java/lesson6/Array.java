package lesson6;


import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (true) {
            menu();
            int n = in.nextInt();
            if (n < 1) {
                System.out.println("Длина массива не может быть меньше 1. Введите длину массива:");
            }
            else {
                int[] arr = createArr(n);
                System.out.println("Случайно созданный массив: " + Arrays.toString(arr));
                System.out.println("Минмальное значение в массиве: " + minArray(arr));
                System.out.println("Максимальное значение в массиве: " + maxArray(arr));
                System.out.println("Среднее значение массива: " + averArray(arr));
                break;
            }
        }
    }

    public static void menu() {
        System.out.println("Введите длину массива: ");
    }
    public static int[] createArr(int n){
        int[] arr = new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
    public static int minArray(int arr[]){
        int min = arr[0];
        for (int i = 1; i < arr.length; i ++)
            if (min > arr[i]) {
                min = arr[i];
            }
        return min;
    }
   public static int maxArray(int arr[]){
       int max = arr[0];
       for (int i = 0; i<arr.length; i ++)
           if (max < arr[i]){
               max = arr[i];
           }
       return max;
   }

   public static double averArray(int arr[]){
        double sum = 0;
       for (int i = 0; i<arr.length; i ++) {
           sum +=arr[i];
       }
       return sum/arr.length;



    }
}