package anlov.java;


public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 5, b = 6;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int color = 53;
        if (color <= 0) {
            System.out.println("Красный");
        } else if (color <= 100 && color > 0) {
            System.out.println("Желтый");
        } else System.out.println("Зеленый");
    }

//    Создайте метод compareNumbers(), в теле которого
//    объявите две int переменные a и b, и инициализируйте их
//    любыми значениями, которыми захотите. Если a больше или
//    равно b, то необходимо вывести в консоль сообщение “a >=
//    b”, в противном случае “a < b”;

    public static void compareNumbers() {
        int value = 5, value2 = 7;
        if (value >= value2) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }
}