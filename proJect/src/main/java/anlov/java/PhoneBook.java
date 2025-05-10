package anlov.java;

import java.util.*;

public class PhoneBook {
    Map<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void addNew(String lastName, String mobilePhone) {
        if (lastName == null || mobilePhone == null || lastName.trim().isEmpty() || mobilePhone.trim().isEmpty()) {
            throw new IllegalArgumentException("Заполните обязательные поля");
        } else if (phoneBook.containsKey(lastName)) {
            List<String> number = phoneBook.get(lastName);

            if (number.contains(mobilePhone)) {
                System.out.printf("Номер %s уже есть у абонента %s.%n", mobilePhone, lastName);
            } else {
                number.add(mobilePhone);
                System.out.printf("Номер %s добавлен для %s.%n", mobilePhone, lastName);
            }
        } else {
            phoneBook.put(lastName, new ArrayList<>(Arrays.asList(mobilePhone)));
            System.out.println("Добавлен новый абонент.");
        }

    }

    public void getNumbers(String lastName) {
        phoneBook.get(lastName);
        System.out.printf("По фамили %s, я нашел следующие номера: %s", lastName, phoneBook.get(lastName));
    }
}
