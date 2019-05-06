package ch4.inheritance;

import java.lang.reflect.Method;

/**
 * Write a method that prints a table of values for any Method representing a static
 * method with a parameter of type double or Double. Besides the Method object,
 * accept a lower bound, upper bound, and step size. Demonstrate your method by
 * printing tables for Math.sqrt and Double.toHexString. Repeat, using a
 * DoubleFunction<Object> instead of a Method (see Section 3.6.2,
 * “Choosing a Functional Interface,” on p. 113). Contrast the safety, efficiency, and
 * convenience of both approaches.
 */
public class Task13 {
    public static void main(String[] args) throws Exception {
        print(Math.class.getMethod("sqrt", double.class), 1, 9, 0.89);
        print(Double.class.getMethod("toHexString", double.class), 1, 9, 0.89);
    }

    public static void print(Method m, double lower, double upper, double step) throws Exception {
        System.out.println(m.getDeclaringClass().getCanonicalName() + "." + m.getName());
        for (double i = lower; i <= upper; i += step) {
            System.out.printf("%.2f | %s\n", i, m.invoke(null, i));
        }
    }
}
