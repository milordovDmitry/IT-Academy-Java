package lesson12;

public class MyArray {
    public int calc(String[][] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(myArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Преобразование массива не удалось. В ячейке под номером " + (i + 1) + " / " + (j + 1) +
                            " лежит символ или текст вместо числа.");
                }
            }
        }
        return sum;
    }

    public void printSum(String[][] myArray) {
        try {
            if (myArray.length != 4 || myArray[0].length != 4 || myArray[1].length != 4 || myArray[2].length != 4 || myArray[3].length != 4) {
                throw new MyArraySizeException("Задан неправильный размер массива.");
            } else {
                System.out.println("Сумма всех чисел в ячейках равна " + calc(myArray) + ".");
            }
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
    }
}
