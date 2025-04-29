package anlov.java;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String nameOfFile = "Lesson_6.csv";

        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{123, 223, 54}, {52, 123, 54}};

        Writer writer = new Writer(header, data);
        writer.saveFile(nameOfFile);

        Reader.reading(nameOfFile);
    }
}