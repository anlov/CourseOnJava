package anlov.java;

import java.util.List;

public class SecondExercise {

    public static long countOfWord(List<String> strings, String word) {
        return strings.stream().filter(x -> x.equals(word)).count();
    }

    public static String firstElement(List<String> strings) {
        return strings.stream().findFirst().orElse("0");
    }

    public static String lastElement(List<String> strings) {
        return strings.stream().skip(strings.size() - 1).findFirst().orElse("0");
    }
}
