package anlov.java;

public class Factorial {

    public static long getFactorial(int num) {
        long factorial = 1;
        if (num < 0) {
            throw new IllegalArgumentException("Число должно быть положительным");
        }
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
