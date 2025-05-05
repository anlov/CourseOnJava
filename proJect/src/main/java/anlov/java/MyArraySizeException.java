package anlov.java;

public class MyArraySizeException extends Exception {

    private final int rowArray;
    private final int columnArray;

    public MyArraySizeException(String info, int rowArray, int columnArray) {
        super(info);
        this.rowArray = rowArray;
        this.columnArray = columnArray;
    }

    public String getArraySize() {
        return rowArray + "x" + columnArray;
    }
}
