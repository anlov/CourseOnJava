package anlov.java;

public class Dog extends Animal {
    private static int countOfDog;

    public Dog(String name, String color) {
        super(name, color);
        ++countOfDog;
    }

    @Override
    public void run(int length) {
        if (length > 500) {
            System.out.println("Собачка пробежала 500 метров и очень устала)");
        } else if (length < 0) {
            System.out.println("Ошибка!");
        } else System.out.println("Собачка пробежала " + length + " метров.");
    }

    public static void getCountOfDog() {
        System.out.println("Количество родившихся собачек: " + countOfDog);
    }

    @Override
    public void swim(int length) {
        if (length < 11) {
            System.out.println("Собачка проплыла: " + length + " метров.");
        } else if (length < 0) {
            System.out.println("Ошибка!");
        } else System.out.println("Собачка проплыла 10 метров и очень устала)");
    }
}
