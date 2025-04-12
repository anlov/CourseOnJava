package anlov.java;

public class Dish {
    private int countOfEats;

    public Dish(int countOfEats) {
        this.countOfEats = countOfEats;
    }

    public int addEats(int add) {
        countOfEats += add;
        return countOfEats;
    }

    public void eatOfFood(int eat) {
        if (countOfEats - eat >= 0) {
            countOfEats -= eat;
        } else System.out.println("В тарелке не хватает еды!");
    }

    public int countOfFood() {
        return countOfEats;
    }
}

