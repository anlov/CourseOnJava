package anlov.java;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik", "blue");
        cat1.run(1000);
        cat1.swim(3);
        Dog dog1 = new Dog("Sharik", "black");
        dog1.run(250);
        dog1.swim(3);
        Cat cat2 = new Cat("Murzik", "green");
        Animal.getCount();
        Cat.getCountOfAnimal();
        Dog.getCountOfDog();

        List<Cat> catList  = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat2);
        catList.add(new Cat("May", "blue"));

        Dish dish1 = new Dish(500);
        dish1.addEats(150);
        for (Cat cat : catList) {
            System.out.println(cat.eatFromDishes(dish1, 650));
            System.out.println(cat.getSatiety());
            dish1.addEats(50);

        }

        Square square = new Square(Colors.BLACK, Colors.GREEN, 5);
        System.out.println(square);
        Circle circle = new Circle(Colors.BLACK, Colors.BLUE, 5);
        System.out.println(circle);
        Triangle triangle = new Triangle(Colors.RED, Colors.BLACK, 3);
        System.out.println(triangle);
    }
}