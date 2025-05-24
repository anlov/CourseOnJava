package anlov.java;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> boxWithFruit = new ArrayList<>();

    public void add(T fruits, int count) {
        for (int i = 0; i < count; i++) {
            boxWithFruit.add(fruits);
        }
    }

    public double getBoxWeight() {
        return boxWithFruit.stream().mapToDouble(Fruit::getWeight).sum();
    }

    public boolean compare(Box<?> fruitsWeight) {
        return this.getBoxWeight() == fruitsWeight.getBoxWeight();
    }

    public void exchange(Box<T> newBox) {
        newBox.boxWithFruit.addAll(this.boxWithFruit);
        this.boxWithFruit.clear();
    }

}
