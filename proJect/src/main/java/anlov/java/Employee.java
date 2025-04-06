package anlov.java;

public class Employee {
    private String fullName;
    private String work;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public Employee(String fullName, String work, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.work = work;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String print() {
        return "My fullName is " + fullName + ". I work as a " + work + ". If you want to call me, that's is my phoneNumber "
                + phoneNumber + " and my email " + email + " . Now my salary is " + salary + ". I'm " + age + " years old";
    }
}
