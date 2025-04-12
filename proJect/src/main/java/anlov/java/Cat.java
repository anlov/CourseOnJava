package anlov.java;

public class Cat extends Animal {
    private static int countOfCat;
    private boolean satiety;

    public Cat(String name, String color) {
        super(name, color);
        this.satiety = false;
        ++countOfCat;
    }

    public static void getCountOfAnimal() {
        System.out.println("Количество родившихся кошечек: " + countOfCat);
    }

    @Override
    public void run(int length) {
        if (length > 200) {
            System.out.println("Кот пробежал " + 200 + " метров и очень устал)");
        } else if (length < 0) {
            System.out.println("Ошибка!");
        } else System.out.println("Кот пробежал " + length + " метров.");
    }

    @Override
    public void swim(int length) {
        System.out.println("К сожалению, котики не умеют плавать(");
    }

    public void setSatiety(boolean value) {
        this.satiety = value;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public String eatFromDishes(Dish dishOfFood, int isHungry) {
        if (dishOfFood.countOfFood() < isHungry) {
            return "Котику " + super.getName() + " мало еды.";
        } else {
            dishOfFood.eatOfFood(isHungry);
            setSatiety(true);
            return "Котик " + getName() + " покушал";
        }
    }
}
