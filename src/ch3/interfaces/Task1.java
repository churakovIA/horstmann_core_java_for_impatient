package ch3.interfaces;

import java.util.stream.Stream;

/**
 * Provide an interface Measurable with a method double getMeasure() that
 * measures an object in some way. Make Employee implement Measurable.
 * Provide a method double average(Measurable[] objects) that
 * computes the average measure. Use it to compute the average salary of an array of
 * employees.
 */
public class Task1 {
    public static void main(String[] args) {
        Measurable[] employees = {
                new Employee(1000),
                new Employee(3000),
                new Employee(2500)
        };
        Stream.of(employees).forEach(System.out::println);
        System.out.printf("Average salary is %.2f", average(employees));
    }

    private static double average(Measurable[] objects) {
        return Stream.of(objects).mapToDouble(Measurable::getMeasure).average().orElse(0);
    }
}
