package ch3.interfaces;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Continue with the preceding exercise and provide a method Measurable
 * largest(Measurable[] objects). Use it to find the name of the employee
 * with the largest salary. Why do you need a cast?
 */
public class Task2 {
    public static void main(String[] args) {
        Measurable[] employees = {
                new Employee("Bill", 1000),
                new Employee("Nick", 3000),
                new Employee("Bob", 2500)
        };
        Stream.of(employees).forEach(System.out::println);
        Employee employee = (Employee) largest(employees);
        System.out.printf("The name of the employee" +
                " with the largest salary is %s", employee.getName());
    }

    private static Measurable largest(Measurable[] objects) {
        return Stream.of(objects).max(Comparator.comparing(Measurable::getMeasure)).orElse(null);
    }
}
