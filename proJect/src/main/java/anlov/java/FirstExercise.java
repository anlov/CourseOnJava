package anlov.java;


import static java.util.Arrays.stream;

public class FirstExercise {

    public static long getChet(int[] nums) {
        return stream(nums).filter(n -> n % 2 == 0).count();

    }
}
