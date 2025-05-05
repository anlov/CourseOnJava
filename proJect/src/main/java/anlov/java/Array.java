package anlov.java;

public class Array {

    private static int sumArray;
    private final static int ARRAYSIZE = 4;

    private Array() {
    }

    public static int getSumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        checkArraySize(array);

        for (int i = 0; i < ARRAYSIZE; i++) {
            for (int j = 0; j < ARRAYSIZE; j++) {
                if (!isInt(array[i][j])) {
                    throw new MyArrayDataException("Введенное значение, не является числом", i, j);
                }
                sumArray += Integer.parseInt(array[i][j]);
            }
        }
        return sumArray;
    }

    private static void checkArraySize(String[][] array) throws MyArraySizeException {
        int rowArray = array.length;
        int columnArray = array[0].length;

        if (rowArray > ARRAYSIZE || columnArray > ARRAYSIZE) {
            throw new MyArraySizeException("Массив выходит за границы допустимого, попробуйте ввести масси 4х4",
                    rowArray, columnArray);
        }
        if (rowArray < ARRAYSIZE || columnArray < ARRAYSIZE) {
            throw new MyArraySizeException("Размер массива меньше допустимого, попробуйте ввести массив 4х4",
                    rowArray, columnArray);
        }
    }

    private static boolean isInt(String convert) {
        try {
            Integer.parseInt(convert);
            return true;
        } catch (NumberFormatException notInt) {
            return false;
        }
    }
}
