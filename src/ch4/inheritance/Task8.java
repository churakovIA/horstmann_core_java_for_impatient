package ch4.inheritance;

import java.util.HashSet;
import java.util.Set;

/**
 * The Class class has six methods that yield a string representation of the type
 * represented by the Class object. How do they differ when applied to arrays,
 * generic types, inner classes, and primitive types?
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(void.class.getName());
        System.out.println(int.class.getName());
        System.out.println(double.class.getName());
        System.out.println(double[].class.getName());
        System.out.println(byte[].class.getName());
        System.out.println(boolean[].class.getName());
        System.out.println(String.class.getName());
        System.out.println((new Object[3]).getClass().getName());
        System.out.println((new int[3][4][5][6][7][8][9]).getClass().getName());
        System.out.println(Set.class.getName());
        System.out.println(Set.class);
        System.out.println((new HashSet<String>()).getClass().getName());
        System.out.println(Task4.Rectangle.class.getName());
    }
}
