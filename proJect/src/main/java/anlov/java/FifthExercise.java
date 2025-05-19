package anlov.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FifthExercise {

    private static final List<String> logins = new ArrayList<>();

    public static List<String> getLogins() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String login = scanner.nextLine();
            if (login.isEmpty()) {
                break;
            }
            logins.add(login);
        }
        return logins.stream().filter(s -> s.startsWith("f")).collect(Collectors.toList());
    }
}
