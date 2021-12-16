package lesson12;

public class MyArrayRunner {
    public static void main(String[] args) {
        MyArray m = new MyArray();
        String[][] myArray = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        m.printSum(myArray);

        MyArray n = new MyArray();
        String[][] myDataError = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "не число"}};
        n.printSum(myDataError);

        MyArray k = new MyArray();
        String[][] mySizeError = new String[][]{{"1", "2", "3", "4" }, {"1", "2", "3"}, {"1", "2", "3"}, {"1", "2", "3"}};
        k.printSum(mySizeError);
    }
}