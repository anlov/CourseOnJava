package anlov.java;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1 задание
        Employee employee1 = new Employee("Orlov Andrey Aleksandrovich",
                "QA Engineer", "andrey.qweqw@gmail.com", "+375222222222", 350, 27 );
        // 2 задание
        Employee[] empArray = new Employee[5];
        empArray[0] = employee1;
        empArray[1]  = new Employee("Good Anything All",
                "AQA Engineer", "good.qweqw@gmail.com", "+375222322222", 300, 21 );
        empArray[2]  = new Employee("Anna Maria All",
                "AQA Engineer", "anna.qweqw@gmail.com", "+375221322222", 20, 14 );
        empArray[3]  = new Employee("MArk Ivanov All",
                "AQA Engineer", "mark.qweqw@gmail.com", "+375332322222", 250, 21 );
        empArray[4]  = new Employee("Ivan Anything All",
                "AQA Engineer", "ivan.qweqw@gmail.com", "+375292322222", 7000, 37 );

        for (Employee s : empArray) {
            System.out.println(s.print());
        }

        // 3 задание
        Park wonderFull = new Park();
        wonderFull.addAttraction("Great attraction", "9.00 - 23.00", 25.5);
        Park theBestPark = new Park();
        theBestPark.addAttraction("The Best attraction", "08.30 - 00.00", 17);

        wonderFull.displayAttractions();
        theBestPark.displayAttractions();

    }
}