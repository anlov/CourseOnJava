package anlov.java;

public class Animal {
    private String name;
    private String color;

    private static int count;

    public Animal(String name, String color) {
        ++count;
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void getCount() {
        System.out.println("Количество рожденных животных: " + count);
    }

    public void run(int length) {
        System.out.println("Животное пробежало:" + length + "метров.");
    }

    public void swim(int length) {
        System.out.println("Животное проплыло:" + length + "метров.");
    }


}
