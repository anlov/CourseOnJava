package anlov.java;


public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"},
                {"9", "15", "11", "12"}, {"13", "14", "15", "16"}};

        try {
            System.out.println(Array.getSumArray(array));
        } catch (MyArraySizeException size) {
            System.out.println(size.getMessage() + ", введенный массив имеет размер " + size.getArraySize());
        } catch (MyArrayDataException data) {
            System.out.println(data.getMessage() + " " + data.getArrayIndex());
        }

    }
}