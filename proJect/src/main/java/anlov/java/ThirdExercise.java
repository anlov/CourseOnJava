package anlov.java;


import java.util.List;

public class ThirdExercise {

    public static String[] sortedStrings(List<String> strings) {
       return strings.stream().sorted().toArray(String[]::new);
    }
}
