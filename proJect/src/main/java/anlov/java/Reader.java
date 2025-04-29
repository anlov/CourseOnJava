package anlov.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    private Reader() {

    }

    public static void reading(String file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String message;
            while ((message = reader.readLine()) != null) {
                System.out.println(message);
            }
            reader.close();
            System.out.println("Чтение из файла.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
