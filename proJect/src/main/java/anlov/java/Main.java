package anlov.java;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1 задание
        int[] abc = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
        System.out.println(FirstExercise.getChet(abc));

        // 2 задание
        List<String> strings = List.of("Highload", "High", "Load", "Highload", "High");
        System.out.println(SecondExercise.countOfWord(strings, "High"));
        System.out.println(SecondExercise.firstElement(strings));
        System.out.println(SecondExercise.lastElement(strings));

        // 3 задание
        List<String> strings1 = List.of("f10", "f4", "f15", "f2", "f4");
        System.out.println(Arrays.toString(ThirdExercise.sortedStrings(strings1)));

        // 4 задание
        FourthExercise fourthExercise = new FourthExercise();
        System.out.println(fourthExercise.middleAge());
        System.out.println(fourthExercise.wantsToArmy());

        // 5 задание
        System.out.println(FifthExercise.getLogins());
    }
}