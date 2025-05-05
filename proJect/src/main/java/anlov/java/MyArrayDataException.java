package anlov.java;


public class MyArrayDataException extends Exception {
    private final int rowArrayIndex;
    private final int columnArrayIndex;

    public MyArrayDataException(String info, int rowArrayIndex, int columnArrayIndex) {
        super(info);
        this.rowArrayIndex = rowArrayIndex;
        this.columnArrayIndex = columnArrayIndex;
    }

    public String getArrayIndex() {
        return "[" + rowArrayIndex + "]" + "[" + columnArrayIndex + "]";
    }
}
