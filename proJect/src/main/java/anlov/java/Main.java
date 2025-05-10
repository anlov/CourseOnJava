package anlov.java;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        String[] words = {"1", "2", "3", "1", "2", "3", "1", "2", "3", "1", "2", "3", "1", "2", "3", "1", "2", "3"};
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println(uniqueWords);

        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);

            }
        }
        for (Map.Entry<String, Integer> map1 : map.entrySet()) {
            System.out.printf("Слово: %s встречается %d раз\n", map1.getKey(), map1.getValue());
        }

        // Задание 2
        PhoneBook phoneBook = new PhoneBook();

        try {
            phoneBook.addNew("", "555555"); // IllegalArgumentException!
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        phoneBook.addNew("Орлов", "7917111134");
        phoneBook.addNew("Орлов", "1234566789");
        phoneBook.addNew("Петров", "7917111134");

        phoneBook.getNumbers("Орлов");
    }
}