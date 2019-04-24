package ch3.interfaces;

import java.util.Arrays;
import java.util.Comparator;

import static utils.PrintUtil.print;

/**
 * Write a call to Arrays.sort that sorts employees by salary, breaking ties by
 * name. Use Comparator.thenComparing. Then do this in reverse order.
 */
public class Task14 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Bill", 1000),
                new Employee("Nick", 3000),
                new Employee("Bob", 3000)
        };
        sort(employees);
        print(employees);
    }

    private static void sort(Employee[] employees){
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getName));
    }
}
