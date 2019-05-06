package ch4.inheritance;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.StringJoiner;

/**
 * Write a “universal” toString method that uses reflection to yield a string with all
 * instance variables of an object. Extra credit if you can handle cyclic references.
 */
public class Task9 {
    public static void main(String[] args) throws Exception {
        Task4.Rectangle rectangle = new Task4.Rectangle(new Point(1, 1), 100, 50);
        System.out.println(toString(rectangle));
        System.out.println(toString("abc"));
        System.out.println(toString(new HashSet<Object>()));
    }

    public static String toString(Object o) throws Exception {
        Class<?> clazz = o.getClass();
        StringJoiner joiner = new StringJoiner(",", clazz.getName() + "{", "}");
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            joiner.add(field.getName() + "=" + field.get(o).toString());
        }
        return joiner.toString();
    }
}
