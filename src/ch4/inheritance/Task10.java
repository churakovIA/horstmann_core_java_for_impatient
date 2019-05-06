package ch4.inheritance;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Use the MethodPrinter program in Section 4.5.1, “Enumerating Class
 * Members,” on p. 160 to enumerate all methods of the int[] class. Extra credit if
 * you can identify the one method (discussed in this chapter) that is wrongly
 * described.
 */
public class Task10 {
    public static void main(String[] args) {
        printMethods("[I"); // int[] class
    }

    public static void printMethods(String className) {
        Class<?> cl = null;
        try {
            cl = Class.forName(className);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }
        while (cl != null) {
            for (Method m : cl.getDeclaredMethods()) {
                System.out.println(
                        Modifier.toString(m.getModifiers()) + " " + m.getReturnType().getCanonicalName()
                                + " " + m.getName() + Arrays.toString(m.getParameters()));
            }
            cl = cl.getSuperclass();
        }
    }
}
